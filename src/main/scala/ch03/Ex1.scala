package ch03

object Ex1 {
  def main(args: Array[String]) {
    val big = new java.math.BigInteger("12345")
    println("big [" + (big) + "]")

    val greetStrings = new Array[String](3)

    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"

    for (i <- 0 to 2)
      print(greetStrings(i))
  }
}
