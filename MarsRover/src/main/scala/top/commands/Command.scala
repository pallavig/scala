package top.commands

import top.MarsRover

trait Command {
  def execute(rover: MarsRover):MarsRover
}
