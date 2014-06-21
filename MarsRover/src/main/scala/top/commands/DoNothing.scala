package top.commands

import top.MarsRover

object DoNothing extends Command {
  def execute(rover: MarsRover) = rover
}
