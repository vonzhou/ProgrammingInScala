package ch06.ex1

class Rational(n: Int, d: Int) {
  println("Created " + n + "/" + d)
}

object Main {
  def main(args: Array[String]) {
    println(new Rational(1, 2))
    println(new Rational(1, 3))
  }
}
