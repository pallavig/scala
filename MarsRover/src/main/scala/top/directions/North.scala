package top.directions

class North extends Direction{
  def left(): Direction = new West

  def right(): Direction = new East

  override def toString: String = "N"
}