package top.commands

import top.MarsRover

object TurnRoverRight extends Command {
  def execute(rover: MarsRover) =
    rover.turnRight
}
