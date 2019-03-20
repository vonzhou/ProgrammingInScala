package ch03

object Ex6 {
  def main(args: Array[String]) {
    def countchars4(args: Array[String]) {
      import scala.io.Source

      def widthOfLength(s: String) = s.length.toString.length

      if (args.length > 0) {

        val lines = Source.fromFile(args(0)).getLines().toList

        val longestLine = lines.reduceLeft(
          (a, b) => if (a.length > b.length) a else b
        )
        val maxWidth = widthOfLength(longestLine)

        for (line <- lines) {
          val numSpaces = maxWidth - widthOfLength(line)
          val padding = " " * numSpaces
          println(padding + line.length + " | " + line)
        }
      }
      else
        Console.err.println("Please enter filename")
    }
    countchars4(Array("countchars1.scala"))
  }
}
