package gol

object DeadOrAlive {
  def isAlive(currentlyAlive: Boolean, neighboursCount: Int): Boolean = {
    neighboursCount match {
      case x if x < 2 => false
      case x if (x == 2 && currentlyAlive) || (x == 3) => true
      case _ => false
    }
  }
}


