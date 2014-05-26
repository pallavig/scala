package top

case class Grid(rows:Int,columns:Int) {
  def isValidPoint(point:Point):Boolean = {
    if(point.x > rows || point.x < 0) false
    else if(point.y > columns || point.y < 0) false
    else true
  }
}