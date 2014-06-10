package top

import org.specs2.mutable.Specification
import top.directions.{North, South, West, East}

class PositionTest extends Specification {
  "move when direction is east" in {
    val position = new Position(new Point(1, 2), new East)
    val newPosition = position.moveOneStep(new Grid(5, 5))
    newPosition.point mustEqual new Point(2, 2)
  }

  "move when direction is south" in {
    val position = new Position(new Point(0, 2), new South)
    val newPosition = position.moveOneStep(new Grid(5, 5))
    newPosition.point mustEqual new Point(0, 1)
  }

  "move when direction is west" in {
    val position = new Position(new Point(0, 1), new West)
    val newPosition = position.moveOneStep(new Grid(5, 5))
    newPosition.point mustEqual new Point(0, 1)
  }

  "move when direction is north" in {
    val position = new Position(new Point(1, 1), new North)
    val newPosition = position.moveOneStep(new Grid(5, 5))
    newPosition.point mustEqual new Point(1, 2)
  }
}
