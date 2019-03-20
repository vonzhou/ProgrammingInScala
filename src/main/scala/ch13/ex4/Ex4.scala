
package bobsrockets {
  package navigation {

    class Navigator {
      // No need to say bobsrockets.navigation.StarMap
      val map = new StarMap
    }

    class StarMap

  }

  class Ship {
    // No need to say bobsrockets.navigation.Navigator
    val nav = new navigation.Navigator
  }
  package fleets {

    class Fleet {
      // No need to say bobsrockets.Ship
      def addShip() = {
        new Ship
      }
    }

  }

}
