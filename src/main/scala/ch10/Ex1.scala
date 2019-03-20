package ch10

object Ex1 {

  abstract class Element {
    def contents: Array[String]

    def height: Int = contents.length

    def width: Int = if (height == 0) 0 else contents(0).length
  }

  def main(args: Array[String]) {
    val elem = new Element {
      def contents = Array("foo")
    }
    println("elem [" + elem + "]")
  }
}
