package ch06.ex4

//P97
class Rational(n: Int, d: Int) {
  // 前置条件
  require(d != 0)

  override def toString = n + "/" + d
}

object Main {
  def main(args: Array[String]) {
    // throws IllegalArgumentException: requirement failed
    new Rational(5, 0)
  }
}
