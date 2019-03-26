class Outer {

  class Inner

}


val o1 = new Outer
val o2 = new Outer


val i = new o1.Inner
println(i)

/**
  * error: this.Outer is not a legal prefix for a constructor
  */
//new Outer#Inner