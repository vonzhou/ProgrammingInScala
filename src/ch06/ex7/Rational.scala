package ch06.ex7

class Rational(n: Int, d: Int) {

  require(d != 0)

  val numer: Int = n
  val denom: Int = d

  def this(n: Int) = this(n, 1) // auxiliary constructor 辅助构造函数

  override def toString = numer + "/" + denom

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
}

object Main {
  def main(args: Array[String]) {
    val y = new Rational(3)
    println("y [" + y + "]")
  }
}
