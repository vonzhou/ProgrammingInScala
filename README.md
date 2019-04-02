# Programming In Scala

脚本运行方式:

```
scala -nc hello.scala
```


类运行方式:

```
➜  ch04 git:(master) ✗ scalac ChecksumAccumulator.scala Summer.scala
➜  ch04 git:(master) ✗ scala ch04.Summer hello scala                
hello: -20
scala: -4
```

## 16. Working with Lists

## 17. Working with other Collections

## 18. Mutable Objects

## 19. Type Parameterization

## 20. Abstract Members

```Scala
scala> trait Abstract {
     |   type T
     |
     |   def transform(x: T): T
     |
     |   val initial: T
     |
     |   var current: T
     | }
defined trait Abstract

scala> class Concrete extends Abstract {
     |   type T = String
     |
     |   def transform(x: String) = x + x
     |
     |   val initial = "hi"
     |   var current = initial
     | }
defined class Concrete

scala>

scala> println(new Concrete().transform("vonzhou"))
vonzhouvonzhou
```


## 21.  Implicit Conversions and Parameters

scala.Int:

```scala
  import scala.language.implicitConversions
  implicit def int2long(x: Int): Long = x.toLong
  implicit def int2float(x: Int): Float = x.toFloat
  implicit def int2double(x: Int): Double = x.toDouble
```

Predef:

```scala
 implicit final class ArrowAssoc[A](private val self: A) extends AnyVal {
    @inline def -> [B](y: B): Tuple2[A, B] = Tuple2(self, y)
    def →[B](y: B): Tuple2[A, B] = ->(y)
  }
```

22. Implementing Lists

2个子类：:: 和 Nil

covariant

```scala
val xs = List(1,2,3)
var ys:List[Any] = xs
println(ys)
```


List定义了3个抽象方法：

```scala
 def isEmpty: Boolean
  def head: A
  def tail: List[A]
```


:: 方法的参数类型有一个lower bound，交互模式下运行：

```scala
scala> abstract class Fruit
defined class Fruit

scala> class Apple extends Fruit
defined class Apple

scala> class Orange extends Fruit
defined class Orange

scala> val apples = new Apple :: Nil
apples: List[Apple] = List(Apple@1224e1b6)

scala> val fruits = new Orange :: apples
fruits: List[Fruit] = List(Orange@61d09475, Apple@1224e1b6)
```