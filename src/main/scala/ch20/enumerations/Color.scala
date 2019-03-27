object Color1 extends Enumeration {
  val Red = Value
  val Green = Value
  val Blue = Value
}

object Color extends Enumeration {
  val Red, Green, Blue = Value
}

println(Color.Red.id)
println(Color.Blue.id)
