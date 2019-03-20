package ch08


object Approximate {
  def isGoodEnough(guess: Double): Boolean = {
    println("guess [" + guess + "]")
    math.abs(guess * guess - 2.0) < 1.0E-6
  }

  def improve(guess: Double): Double =
    (guess + 2.0 / guess) / 2.0

  // 尾递归
  def approximate(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else approximate(improve(guess))

  def approximateLoop(initialGuess: Double): Double = {
    var guess = initialGuess
    while (!isGoodEnough(guess))
      guess = improve(guess)
    guess
  }

  def main(args: Array[String]) {
    approximateLoop(3.3)
  }
}
