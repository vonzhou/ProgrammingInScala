package ch10

// P184 扩展类
object Ex2 {

  abstract class Element {
    def contents: Array[String]

    val height = contents.length
    val width =
      if (height == 0) 0 else contents(0).length
  }

  class ArrayElement(conts: Array[String]) extends Element {
    def contents: Array[String] = conts
  }

  def main(args: Array[String]) {
    val arrayElem = new ArrayElement(Array("foo"))
    println("arrayElem [" + arrayElem + "]")

    val a123 = Array(1, 2, 3).toString
    val abcLen = "abc".length
    val helloLen = "hello".length // no () because no side-effect
    println() // better to not drop the ()


    val e: Element = new ArrayElement(Array("hello"))

    println("a123 [" + a123 + "]")
    println("abcLen [" + abcLen + "]")
    println("helloLen [" + helloLen + "]")
    println("e [" + e + "]")
  }
}
