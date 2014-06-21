package top

import top.commands._
import top.directions.Direction

class Session(val grid: Grid,val rovers: List[MarsRover]) {
  val map: Map[String, Command] = Map("L"->TurnRoverLeft, "R"->TurnRoverRight, "M"->MoveRover)

  def update(newRover: String, command: String): Session = {
    val inputInfoForRover = newRover.split(" ")
    val direction = Direction(inputInfoForRover(2))
    val roverStartingPosition = new Position(
      new Point(inputInfoForRover(0).toInt, inputInfoForRover(1).toInt),
      direction
    )

    var rover = new MarsRover(roverStartingPosition, grid)

    for (instruction <- command) {
      rover = map.getOrElse(instruction.toString, DoNothing).execute(rover)
    }

    new Session(grid, rovers :+ rover)
  }
}
