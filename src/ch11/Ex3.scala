package ch11


object Ex3 {
  def divide(x: Int, y: Int): Int =
    if (y != 0) x / y
    else sys.error("can't divide by zero") // error方法不在Predef里面了

  def main(args: Array[String]) {
    val d1 = divide(4, 2)
    println("d1 [" + d1 + "]")

    try {
      val d2 = divide(4, 0)
      println("d2 [" + d2 + "]")
    } catch {
      case ex: RuntimeException => println("ex [" + ex + "]")
    }
  }
}
