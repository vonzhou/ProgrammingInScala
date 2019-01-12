package ch06.ex6

// P100
class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d

  override def toString = numer + "/" + denom

  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this.lessThan(that)) that else this // 这里
}

object Main {
  def main(args: Array[String]) {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)

    println("oneHalf [" + oneHalf + "]")
    println("twoThirds [" + twoThirds + "]")

    println("oneHalf.lessThan(twoThirds) [" + oneHalf.lessThan(twoThirds) + "]")
    println("oneHalf.max(twoThirds) [" + oneHalf.max(twoThirds) + "]")
  }
}
