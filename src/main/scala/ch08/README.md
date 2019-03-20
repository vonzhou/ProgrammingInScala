```
➜  ch08 git:(master) ✗ scalac -Xprint:parse Approximate.scala 
[[syntax trees at end of                    parser]] // Approximate.scala
package ch08 {
  object Approximate extends scala.AnyRef {
    def <init>() = {
      super.<init>();
      ()
    };
    def isGoodEnough(guess: Double): Boolean = {
      println("guess [".$plus(guess).$plus("]"));
      math.abs(guess.$times(guess).$minus(2.0)).$less(1.0E-6)
    };
    def improve(guess: Double): Double = guess.$plus(2.0.$div(guess)).$div(2.0);
    def approximate(guess: Double): Double = if (isGoodEnough(guess))
      guess
    else
      approximate(improve(guess));
    def approximateLoop(initialGuess: Double): Double = {
      var guess = initialGuess;
      while$1(){
        if (isGoodEnough(guess).unary_$bang)
          {
            guess = improve(guess);
            while$1()
          }
        else
          ()
      };
      guess
    };
    def main(args: Array[String]): scala.Unit = approximateLoop(3.3)
  }
}

➜  ch08 git:(master) ✗ javap ch08.Approximate
Compiled from "Approximate.scala"
public final class ch08.Approximate {
  public static void main(java.lang.String[]);
  public static double approximateLoop(double);
  public static double approximate(double);
  public static double improve(double);
  public static boolean isGoodEnough(double);
}
➜  ch08 git:(master) ✗ javap -c ch08.Approximate
Compiled from "Approximate.scala"
public final class ch08.Approximate {
  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #16                 // Field ch08/Approximate$.MODULE$:Lch08/Approximate$;
       3: aload_0
       4: invokevirtual #18                 // Method ch08/Approximate$.main:([Ljava/lang/String;)V
       7: return

  public static double approximateLoop(double);
    Code:
       0: getstatic     #16                 // Field ch08/Approximate$.MODULE$:Lch08/Approximate$;
       3: dload_0
       4: invokevirtual #22                 // Method ch08/Approximate$.approximateLoop:(D)D
       7: dreturn

  public static double approximate(double);
    Code:
       0: getstatic     #16                 // Field ch08/Approximate$.MODULE$:Lch08/Approximate$;
       3: dload_0
       4: invokevirtual #25                 // Method ch08/Approximate$.approximate:(D)D
       7: dreturn

  public static double improve(double);
    Code:
       0: getstatic     #16                 // Field ch08/Approximate$.MODULE$:Lch08/Approximate$;
       3: dload_0
       4: invokevirtual #28                 // Method ch08/Approximate$.improve:(D)D
       7: dreturn

  public static boolean isGoodEnough(double);
    Code:
       0: getstatic     #16                 // Field ch08/Approximate$.MODULE$:Lch08/Approximate$;
       3: dload_0
       4: invokevirtual #32                 // Method ch08/Approximate$.isGoodEnough:(D)Z
       7: ireturn
}

```