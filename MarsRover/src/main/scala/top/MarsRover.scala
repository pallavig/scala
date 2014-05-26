package top

case class MarsRover(position:Position,grid:Grid) {
  def turnLeft = this.copy(position = position.left())
  def turnRight = this.copy(position = position.right())
  def move = this.copy(position = position.moveOneStep(grid))
}