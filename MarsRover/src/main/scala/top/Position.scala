package top

import top.directions._

case class Position(point: Point, direction: Direction) {
  private def giveAppropriatePosition(grid: Grid, pointWhereRoverWantsToBe: Point): Position = {
    if (grid.isValidPoint(pointWhereRoverWantsToBe))
      this.copy(point = pointWhereRoverWantsToBe)
    else
      this
  }

  def moveOneStep(grid: Grid): Position = direction match {
    case direction: East => giveAppropriatePosition(grid, new Point(point.x + 1, point.y))
    case direction: West => giveAppropriatePosition(grid, new Point(point.x - 1, point.y))
    case direction: North => giveAppropriatePosition(grid, new Point(point.x, point.y + 1))
    case direction: South => giveAppropriatePosition(grid, new Point(point.x, point.y - 1))
  }

  def left(): Position = this.copy(direction = direction.left())

  def right(): Position = this.copy(direction = direction.right())
}