trait LazyRationalTrait {
  val numerArg: Int
  val denomArg: Int
  lazy val numer = numerArg / g
  lazy val denom = denomArg / g

  override def toString = numer + "/" + denom

  private lazy val g = {
    require(denomArg != 0)
    gcd(numerArg, denomArg)
  }

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

val x = 2
val r = new LazyRationalTrait {
  val denomArg = 1 * x
  val numerArg = 2 * x
}

println(r)