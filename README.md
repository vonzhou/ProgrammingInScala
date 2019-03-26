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


## 21.