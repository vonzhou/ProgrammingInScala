args.foreach(arg => println(arg))
println("----------")

args.foreach((arg: String) => println(arg))
println("----------")


args.foreach(println)
println("----------")


for (arg <- args)
  println(arg)