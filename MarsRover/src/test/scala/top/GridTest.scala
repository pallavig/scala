package top

import org.specs2.mutable.Specification

class GridTest extends Specification {
  "grid" should {
    "tell if point is valid" in {
      val grid = new Grid(2, 3)
      grid.isValidPoint(new Point(1, 1)) must beTrue
      grid.isValidPoint(new Point(2, 3)) must beTrue
      grid.isValidPoint(new Point(0, 0)) must beTrue
    }

    "tell if the point is invalid" in {
      val grid = new Grid(2, 3)
      grid.isValidPoint(new Point(2, 4)) must beFalse
      grid.isValidPoint(new Point(2, -1)) must beFalse
      grid.isValidPoint(new Point(3, 2)) must beFalse
      grid.isValidPoint(new Point(-1, 2)) must beFalse
    }
  }
}
