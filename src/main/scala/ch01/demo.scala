/**
  * Created by vonzhou on 2019/1/10.
  */

var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital("France"))


def factorial(x: BigInt): BigInt =
if (x == 0) 1 else x * factorial(x - 1)
factorial(30)


//import java.math.BigInteger
//def factorial2(x: BigInteger): BigInteger =
//  if (x == BigInteger.ZERO)
//    BigInteger.ONE
//  else
//    x.multiply(factorial2(x.subtract(BigInteger.ONE)))
//
//val res = factorial2(new BigInteger("30", 10)).toString


