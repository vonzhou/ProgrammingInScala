class Food

abstract class Animal {
  // subtype of Food
  type SuitableFood <: Food

  def eat(food: SuitableFood)
}


class Grass extends Food

class Cow extends Animal {
  type SuitableFood = Grass

  override def eat(food: Grass) = {
    println(this + " eat " + food)
  }
}


new Cow().eat(new Grass())



