def longestWord(words: Array[String]) = {
  var word = words(0)
  var idx = 0
  for (i <- 1 until words.length)
    if (words(i).length > word.length) {
      word = words(i)
      idx = i
    }
  (word, idx)
}

val res = longestWord("The quick brown fox".split(" "))
res._1
res._2
//val w, index = longestWord("The quick brown fox".split(" "))

