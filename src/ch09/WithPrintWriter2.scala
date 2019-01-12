package ch09


import java.io._

object WithPrintWriter2 {
  // 这样第二个参数就可以使用花括号
  def withPrintWriter(file: File)(op: PrintWriter => Unit) = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  def main(args: Array[String]) {
    val file = new File("date.txt")

    withPrintWriter(file) { writer =>
      writer.println("vonzhou " + new java.util.Date)
    }
  }
}
