package ch08


object Misc {
  def misc1() {
    val someNumbers = List(-11, -10, -5, 0, 5, 10)

    someNumbers.foreach(println _)

    someNumbers.foreach(x => println(x))

    someNumbers.foreach(println _)

    someNumbers.foreach(println)

  }

  def isEven(x: Int): Boolean =
    if (x == 0) true else isOdd(x - 1)

  def isOdd(x: Int): Boolean =
    if (x == 0) false else isEven(x - 1)

  val funValue = nestedFun _

  def nestedFun(x: Int): Unit = {
    if (x != 0) {
      println(x);
      funValue(x - 1)
    }
  }

  def main(args: Array[String]) {
    misc1()

    println("isEven(2) [" + isEven(2) + "]")
    nestedFun(2)
  }
}
