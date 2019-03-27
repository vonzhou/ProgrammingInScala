object Direction1 extends Enumeration {
  val North, East, South, West = Value
}

object Direction extends Enumeration {
  val North = Value("North")
  val East = Value("East")
  val South = Value("South")
  val West = Value("West")
}

for (d <- Direction.values)
  print(d + " ")

println(Direction.North)
println(Direction(2))