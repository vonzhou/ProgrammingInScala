class Keyed {
  def computeKey: Int = 123 * 8888 // this will take some time
}

class MemoKeyed extends Keyed {
  private var keyCache: Option[Int] = None

  override def computeKey: Int = {
    if (!keyCache.isDefined) {
      println("hit ....")
      keyCache = Some(super.computeKey)
    }
    keyCache.get
  }
}

val mk = new MemoKeyed
println(mk.computeKey)
mk.computeKey