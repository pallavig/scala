package top

import top.directions.Direction

class Session(val grid: Grid,val rovers: List[MarsRover]) {
  def update(newRover: String, command: String): Session = {
    val inputInfoForRover = newRover.split(" ")
    val direction = Direction(inputInfoForRover(2))
    val roverStartingPosition = new Position(
      new Point(inputInfoForRover(0).toInt, inputInfoForRover(1).toInt),
      direction
    )

    var rover = new MarsRover(roverStartingPosition, grid)

    for (instruction <- command) {
      if (instruction == 'L') rover = rover.turnLeft
      if (instruction == 'R') rover = rover.turnRight
      if (instruction == 'M') rover = rover.move
    }

    new Session(grid, rovers :+ rover)
  }
}
