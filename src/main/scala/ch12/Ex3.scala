package ch12


object Ex3 {

  class Animal

  trait Furry extends Animal

  trait HasLegs extends Animal

  trait FourLegged extends HasLegs

  class Cat extends Animal with Furry with FourLegged

  def main(args: Array[String]) {
    println("(new Cat) [" + (new Cat) + "]")
  }
}
