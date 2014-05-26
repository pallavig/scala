package top.directions

trait Direction { //each direction can be an object
  def left():Direction
  def right():Direction
}

object Direction {
  def apply(direction:String):Direction = direction match {
    case "N" => new North
    case "S" => new South
    case "E" => new East
    case "W" => new West
  }
}