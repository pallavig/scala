package top.directions

class West extends Direction {
  def left(): Direction = new South

  def right(): Direction = new North

  override def toString: String = "W"
}