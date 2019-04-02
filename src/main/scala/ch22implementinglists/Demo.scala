
// List is covariant
val xs = List(1, 2, 3)
var ys: List[Any] = xs
var zs: List[Int] = Nil
println(ys)




abstract class Fruit
class Apple extends Fruit
class Orange extends Fruit
val apples = new Apple :: Nil
val fruits = new Orange :: apples
