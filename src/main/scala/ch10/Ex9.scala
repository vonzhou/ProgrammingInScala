package ch10


object Ex9 {

  abstract class Element {
    def contents: Array[String]

    def height: Int = contents.length

    def width: Int = if (height == 0) 0 else contents(0).length
  }

  class ArrayElement(val contents: Array[String]) extends Element

  // 注意调用超类构造器的方法
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
    val e1: Element = new ArrayElement(Array("hello", "world"))
    val ae: ArrayElement = new LineElement("hello")
    val e2: Element = ae
    val e3: Element = new UniformElement('x', 2, 3)

    println("e1 [" + e1 + "]")
    println("ae [" + ae + "]")
    println("e2 [" + e2 + "]")
    println("e3 [" + e3 + "]")
  }
}
