package ch10


object Ex5 {

  abstract class Element {
    def contents: Array[String]

    def height: Int = contents.length

    def width: Int = if (height == 0) 0 else contents(0).length
  }

  // 参数化字段
  class ArrayElement(val contents: Array[String]) extends Element

  def main(args: Array[String]) {
    val arrayElem = new ArrayElement(Array("foo"))
    println("arrayElem [" + arrayElem + "]")
  }
}
