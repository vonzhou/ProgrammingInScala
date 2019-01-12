package ch09

object Assert {
  var assertionsEnabled = true

  def myAssert(predicate: () => Boolean) =
    if (assertionsEnabled && !predicate())
      throw new AssertionError

  // 注意和直接传 Boolean 参数之间的区别
  def byNameAssert(predicate: => Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError

  def main(args: Array[String]) {
    try {
      myAssert(() => 5 > 3)
      println("5 > 3")
      myAssert(() => 5 < 3)
    } catch {
      case ex: AssertionError => println("ex [" + ex + "]")
    }

    try {
      byNameAssert(5 > 3)
      println("5 > 3")
      byNameAssert(5 < 3)
    } catch {
      case ex: AssertionError => println("ex [" + ex + "]")
    }
  }
}
