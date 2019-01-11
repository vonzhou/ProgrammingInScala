package ch03

import scala.io.Source

object Ex5 {
  def main(args: Array[String]) {
    def countchars3(args: Array[String]) {
      def widthOfLength(s: String) = s.length.toString.length

      if (args.length > 0) {
        val lines = Source.fromFile(args(0)).getLines().toList
        val longestLine = lines.reduceLeft(
          (a, b) => if (a.length > b.length) a else b
        )
        val maxWidth = widthOfLength(longestLine)
        for (line <- lines) {
          val numSpaces = maxWidth - widthOfLength(line)
          // repeat的实现
          val padding = " " * numSpaces
          println(padding + line.length + " | " + line)
        }
      }
    }
    countchars3(Array("countchars1.scala"))
  }
}
