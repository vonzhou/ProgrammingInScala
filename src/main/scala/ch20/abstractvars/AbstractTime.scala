trait AbstractTime {
  var hour: Int
  var minute: Int
}

trait AbstractTime2 {
  def hour: Int // getter for `hour'
  def hour_=(x: Int) // setter for `hour'
  def minute: Int // getter for `minute'
  def minute_=(x: Int) // setter for `minute'
}