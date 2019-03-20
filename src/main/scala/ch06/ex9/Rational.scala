package ch06.ex9

//P105
class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

object Main {
  def main(args: Array[String]) {
    val x = new Rational(1, 2)
    val y = new Rational(2, 3)
    println("x [" + x + "]")
    println("y [" + y + "]")
    println("x + y [" + (x + y) + "]")
    println("x.+(y) [" + (x.+(y)) + "]")
    println("x + x * y [" + (x + x * y) + "]")
    println("(x + x) * y [" + ((x + x) * y) + "]")
    println("x + (x * y) [" + (x + (x * y)) + "]")
  }
}
