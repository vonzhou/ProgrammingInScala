package ch04

object Ex2 {

  class ChecksumAccumulator {

    private var sum = 0

    def add(b: Byte): Unit = {
      sum += b
    }

    def checksum(): Int = {
      return ~(sum & 0xFF) + 1
    }
  }

  def main(args: Array[String]) {
    val calc = new ChecksumAccumulator
    calc.add(2)

    println("calc.checksum [" + calc.checksum + "]")
  }
}

