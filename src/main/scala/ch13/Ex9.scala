package p {

  class Super {
    protected def f() = {
      println("f")
    }
  }

  class Sub extends Super {
    f()
  }

  class Other {
    // error: f is not accessible
    // Java中可以
    //    (new Super).f()
  }

}
