package ch12


object Ex1 {

  class Animal

  class Frog extends Animal with Philosophical {
    override def toString = "green"
  }

  def main(args: Array[String]) {
    val frog = new Frog
    frog.philosophize()
    println("new Frog [" + frog + "]")
  }
}
