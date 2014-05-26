package top.directions

class East extends Direction {
  def left(): Direction = new North

  def right(): Direction = new South

  override def toString: String = "E"
}