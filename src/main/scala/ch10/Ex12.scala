package ch10


object Ex12 {

  import Element.elem

  abstract class Element {

    def contents: Array[String]

    def width: Int =
      if (height == 0) 0 else contents(0).length

    def height: Int = contents.length

    def above(that: Element): Element =
      elem(this.contents ++ that.contents)

    def beside(that: Element): Element =
      elem(
        for (
          (line1, line2) <- this.contents zip that.contents
        ) yield line1 + line2
      )

    override def toString = contents mkString "\n"
  }

  // 在伴生对象中定义工厂方法
  object Element {

    def elem(contents: Array[String]): Element =
      new ArrayElement(contents)

    def elem(chr: Char, width: Int, height: Int): Element =
      new UniformElement(chr, width, height)

    def elem(line: String): Element =
      new LineElement(line)
  }

  // 具体类可以成为私有的了
  class ArrayElement(conts: Array[String]) extends Element {
    def contents: Array[String] = conts
  }

  class LineElement(s: String) extends ArrayElement(Array(s)) {
    override def width = s.length

    override def height = 1
  }

  class UniformElement(
                        ch: Char,
                        override val width: Int,
                        override val height: Int
                      ) extends Element {
    private val line = ch.toString * width

    def contents = Array.fill(height)(line)
  }

  def main(args: Array[String]) {
    val lineElem = new LineElement("foo")
    println("lineElem [" + lineElem + "]")
  }
}
