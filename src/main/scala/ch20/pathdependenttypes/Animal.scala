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


//new Cow().eat(new Grass())


class DogFood extends Food

class Dog extends Animal {
  type SuitableFood = DogFood

  override def eat(food: DogFood) = {}
}

val bessy = new Cow

val lassie = new Dog

//    error: type mismatch
//lassie eat (new bessy.SuitableFood)

val bootsie = new Dog
lassie eat (new bootsie.SuitableFood) // ok



