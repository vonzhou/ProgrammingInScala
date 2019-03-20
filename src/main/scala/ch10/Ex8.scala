package ch10


object Ex8 {

  class Cat {
    val dangerous = false
  }

  class Tiger(param1: Boolean, param2: Int) extends Cat {
    override val dangerous = param1
    private var age = param2
  }

  def main(args: Array[String]) {
    val tiger = new Tiger(true, 12)
    println("tiger [" + tiger + "]")
  }
}
