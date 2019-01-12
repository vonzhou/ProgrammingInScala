package ch10


object Ex3 {

  abstract class Element {
    def contents: Array[String]

    def height: Int = contents.length

    def width: Int = if (height == 0) 0 else contents(0).length
  }

  class ArrayElement(conts: Array[String]) extends Element {
    // 成为了字段
    val contents: Array[String] = conts
  }

  def main(args: Array[String]) {
    val arrayElem = new ArrayElement(Array("foo"))
    println("arrayElem [" + arrayElem + "]")
  }
}
