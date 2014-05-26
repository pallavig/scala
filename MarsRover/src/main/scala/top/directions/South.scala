package top.directions

class South extends Direction {
  def left(): Direction = new East

  def right(): Direction = new West

  override def toString: String = "S"
}