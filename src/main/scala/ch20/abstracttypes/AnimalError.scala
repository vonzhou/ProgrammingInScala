class Food

abstract class Animal {
  def eat(food: Food)
}

class Grass extends Food

//class Cow extends Animal {
//  override def eat(food: Grass) = {} // This won't compile
//}