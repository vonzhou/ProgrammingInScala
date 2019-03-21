// contravariance
trait OutputChannel[-T] {
  def write(x: T)
}