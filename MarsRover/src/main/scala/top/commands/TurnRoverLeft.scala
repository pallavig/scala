package top.commands

import top.MarsRover

object TurnRoverLeft extends Command {
  def execute(rover: MarsRover) =
    rover.turnLeft
}
