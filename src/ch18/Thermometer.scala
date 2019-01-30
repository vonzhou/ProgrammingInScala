// P367
class Thermometer {

  var celsius: Float = _

  def fahrenheit = celsius * 9 / 5 + 32

  def fahrenheit_=(f: Float) = {
    celsius = (f - 32) * 5 / 9
  }

  override def toString = fahrenheit + "F/" + celsius + "C"
}

val t = new Thermometer
t.celsius = 100
t.fahrenheit = -40