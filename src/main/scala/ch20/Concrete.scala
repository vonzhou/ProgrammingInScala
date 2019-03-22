class Concrete extends Abstract {
  type T = String

  def transform(x: String) = x + x

  val initial = "hi"
  var current = initial
}

println(new Concrete().transform("vonzhou"))