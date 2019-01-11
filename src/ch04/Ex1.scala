package ch04

object Ex1 {

  class ChecksumAccumulator {
    var sum = 0
  }

  def main(args: Array[String]) {
    val calc = new ChecksumAccumulator

    println("calc.sum [" + calc.sum + "]")
  }
}

