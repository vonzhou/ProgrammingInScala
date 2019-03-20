package ch04

object Ex4 {

  class ChecksumAccumulator {
    private var sum = 0

    def add(b: Byte) = sum += b

    def checksum() = ~(sum & 0xFF) + 1
  }

  def main(args: Array[String]) {
    val calc = new ChecksumAccumulator
    calc.add(4)

    println("calc.checksum [" + calc.checksum + "]")
  }
}

