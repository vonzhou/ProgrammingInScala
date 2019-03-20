package ch13


object Ex5 {
  // easy access to Fruit
  import ch13.Fruit

  // easy access to all members of bobsdelights
  import ch13._

  // easy access to all members of Fruits
  import ch13.Fruits._

  def showFruit(fruit: Fruit) = {
    import fruit._
    println(name + "s are " + color)
  }

  def main(args: Array[String]) {
    println("Apple [" + Apple + "]")
    showFruit(Fruits.Apple)
  }
}
