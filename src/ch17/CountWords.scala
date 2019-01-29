// 使用Set
// P346

import scala.collection.mutable
val text = "See Spot run. Run, Spot. Run hell/!"
val wordsArray = text.split("[ !,.]+")
val words = mutable.Set.empty[String]

for (word <- wordsArray)
  words += word.toLowerCase

words