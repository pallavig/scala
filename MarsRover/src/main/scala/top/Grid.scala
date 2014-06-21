package top

case class Grid(rows: Int, columns: Int) {
  def isValidPoint(point: Point) =
    point.x <= rows && point.x >= 0 && point.y <= columns && point.y >= 0
}