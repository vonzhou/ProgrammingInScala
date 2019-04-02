
case class Person(name: String, isMale: Boolean, children: Person*)

val lara = Person("Lara", false)
val bob = Person("Bob", true)
val julie = Person("Julie", false, lara, bob)
val persons = List(lara, bob, julie)

// v1
persons filter (p => !p.isMale) flatMap (p => (p.children map (c => (p.name, c.name))))

// v2: use withFilter
persons withFilter (p => !p.isMale) flatMap (p => (p.children map (c => (p.name, c.name))))

// v3: use for
val c = for (p <- persons; if !p.isMale; c <- p.children)
  yield (p.name, c.name)


val d = for (x <- List(1, 2); y <- List("one", "two"))
  yield (x, y)
println(d)



