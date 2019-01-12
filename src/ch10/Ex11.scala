package ch10


object Ex11 {

  abstract class Element {

    def contents: Array[String]

    def width: Int =
      if (height == 0) 0 else contents(0).length

    def height: Int = contents.length

    def above(that: Element): Element = new ArrayElement(this.contents ++ that.contents)

    def beside(that: Element): Element =
      new ArrayElement(
        for (
          (line1, line2) <- this.contents zip that.contents
        ) yield line1 + line2
      )

    override def toString = contents mkString "\n"
  }

  class LineElement(s: String) extends Element {
    val contents = Array(s)

    override def width = s.length

    override def height = 1
  }

  class ArrayElement(conts: Array[String]) extends Element {
    def contents: Array[String] = conts
  }

  def main(args: Array[String]) {
    val lineElem = new LineElement("foo")
    println("lineElem [" + lineElem + "]")

  }
}
