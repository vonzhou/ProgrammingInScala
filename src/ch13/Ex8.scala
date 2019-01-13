class Outer {

  class Inner {
    private def f() = {
      println("f")
    }

    class InnerMost {
      f() // OK
    }

  }

  //   error: f is not accessible
  // Java中,这样是可以访问的
  //  (new Inner).f()
}
