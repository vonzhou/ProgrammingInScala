class RationalClass(n: Int, d: Int) extends {
  val numerArg = n
  val denomArg = d
} with RationalTrait {
  def +(that: RationalClass) = new RationalClass(
    numer * that.denom + that.numer * denom,
    denom * that.denom
  )
}

trait RationalTrait {
  val numerArg: Int
  val denomArg: Int

  require(denomArg != 0)

  private val g = gcd(numerArg, denomArg)

  val numer = numerArg / g
  val denom = denomArg / g

  private def gcd(a: Int, b: Int): Int =
    if (b == 0)
      a
    else gcd(b, a % b)

  override def toString = numer + "/" + denom
}

println(new RationalClass(1, 2))