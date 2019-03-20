```scala
➜  ProgrammingInScala git:(master) scala
Welcome to Scala version 2.11.7 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_65).
Type in expressions to have them evaluated.
Type :help for more information.

scala> val hex = 0x5
hex: Int = 5

scala> val hex2 = 0x00FF
hex2: Int = 255

scala>  val magic = 0Xcafebabe
magic: Int = -889275714

scala> val dec1 = 31
dec1: Int = 31

scala> val dec2 = 255
dec2: Int = 255

scala> val dec3 = 20
dec3: Int = 20

scala> val prog = 0XCAFEBABEL
prog: Long = 3405691582

scala> val tower = 35L
tower: Long = 35

scala> val of = 31l
of: Long = 31

scala> val little: Short = 367
little: Short = 367

scala> val littler: Byte = 38
littler: Byte = 38

scala> val of:Byte = 25432432434
<console>:1: error: integer number too large
val of:Byte = 25432432434
              ^

scala> val big = 1.2345
big: Double = 1.2345

scala> val biggerStill = 123E45
biggerStill: Double = 1.23E47

scala>  val little = 1.2345F
little: Float = 1.2345

scala> val anotherDouble = 3e5
anotherDouble: Double = 300000.0

scala>  val a = 'A'
a: Char = A

scala> val d = '\u0041'
d: Char = A

scala> val B\u0041\u0044 = 1
BAD: Int = 1

scala>  val escapes = "\\\"\'"
escapes: String = \"'

scala> val s = 'aSymbol
s: Symbol = 'aSymbol

scala> val nm = s.name
nm: String = aSymbol

scala> val name = "reader"
name: String = reader

scala> println(s"Hello, $name!")
Hello, reader!

scala> println(raw"No\\\\escape!") // prints: No\z\z\z{\z}escape!
No\\\\escape!

scala> f"${math.Pi}%.5f"
res2: String = 3.14159

scala> val pi = "Pi"
pi: String = Pi

scala>  f"pi is approximately {math.Pi}%.8f."
<console>:11: error: conversions must follow a splice; use %% for literal %, %n for newline
        f"pi is approximately {math.Pi}%.8f."
                                       ^

scala> f"pi is approximately {math.Pi}%.8f."
<console>:11: error: conversions must follow a splice; use %% for literal %, %n for newline
       f"pi is approximately {math.Pi}%.8f."
                                      ^

scala> val sum = 1 + 2    // Scala invokes 1.+(2)
sum: Int = 3

scala> val sumMore = 1.+(2)
sumMore: Int = 3

scala>  val longSum = 1 + 2L    // Scala invokes 1.+(2L)
longSum: Long = 3

scala> val s = "Hello, world!"
s: String = Hello, world!

scala>  s indexOf 'o'     // Scala invokes s.indexOf('o')
res5: Int = 4

scala>  s indexOf ('o', 5) // Scala invokes s.indexOf('o', 5)
res6: Int = 8

scala> -2.0                  // Scala invokes (2.0).unary_-
res7: Double = -2.0

scala> (2.0).unary_-
res8: Double = -2.0

scala> val s = "Hello, world!"
s: String = Hello, world!

scala>  s.toLowerCase
res9: String = hello, world!

scala>  s toLowerCase
warning: there was one feature warning; re-run with -feature for details
res10: String = hello, world!
```