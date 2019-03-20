class Time {
  var hour = 12
  var minute = 0
}

class Time2 {

  private[this] var h = 12
  private[this] var m = 0

  def hour: Int = h

  def hour_=(x: Int) = {
    h = x
  }

  def minute: Int = m

  def minute_=(x: Int) = {
    m = x
  }
}

class Time3 {

  private[this] var h = 12
  private[this] var m = 0

  // 自己定义getter方法
  def hour: Int = h

  // 自己定义setter方法
  def hour_=(x: Int) = {
    require(0 <= x && x < 24)
    h = x
  }

  def minute = m

  def minute_=(x: Int) = {
    require(0 <= x && x < 60)
    m = x
  }
}