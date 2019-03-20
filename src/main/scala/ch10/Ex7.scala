package ch10


object Ex7 {

  class Cat {
    val dangerous = false
  }

  class Tiger(
               override val dangerous: Boolean,
               private var age: Int
             ) extends Cat

  def main(args: Array[String]) {
    val tiger = new Tiger(true, 12)
    println("tiger [" + tiger + "]")
  }
}
