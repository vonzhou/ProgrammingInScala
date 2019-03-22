trait Abstract {
  type T

  def transform(x: T): T

  val initial: T

  var current: T
}