package ch10


object Ex6 {

  abstract class Element {
    def contents: Array[String]

    def height: Int = contents.length

    def width: Int = if (height == 0) 0 else contents(0).length
  }

  class ArrayElement(val x123: Array[String]) extends Element {
    val contents: Array[String] = x123
  }

  def main(args: Array[String]) {
    val arrayElem = new ArrayElement(Array("foo"))
    println("arrayElem [" + arrayElem + "]")
  }
}
