package top.commands

import top.MarsRover

object MoveRover extends Command {
  def execute(rover: MarsRover) =
    rover.move
}
