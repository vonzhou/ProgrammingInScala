/*
 * Copyright (C) 2007-2016 Artima, Inc. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Example code from:
 *
 * Programming in Scala, Third Edition
 * by Martin Odersky, Lex Spoon, Bill Venners
 *
 * http://booksites.artima.com/programming_in_scala_3ed
 */

package bobsrockets

package navigation {

  private[bobsrockets] class Navigator {
    protected[navigation] def useStarChart() = {}

    class LegOfJourney {
      private[Navigator] val distance = 100
    }

    private[this] var speed = 200
  }

}

package launch {

  import navigation._

  object Vehicle {
    private[launch] val guide = new Navigator
  }

}
