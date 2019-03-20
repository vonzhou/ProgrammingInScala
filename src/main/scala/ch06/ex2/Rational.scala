package ch06.ex2

class Rational(n: Int, d: Int) {
  override def toString = n + "/" + d
}

object Main {
  def main(args: Array[String]) {
    println(new Rational(1, 3))
    println(new Rational(5, 7))
  }
}
