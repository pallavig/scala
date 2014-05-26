package top

import java.util.Scanner

object Start {
  def main(args: Array[String]) {
    val scanner = new Scanner(System.in)

    val gridSize = scanner.nextLine().split(" ")
    val referenceGrid = new Grid(gridSize(0).toInt, gridSize(1).toInt)
    var session = new Session(referenceGrid, Nil)

    while (true) {
      val inputInfoForRover = scanner.nextLine()
      val command = scanner.nextLine()
      session = session.update(inputInfoForRover, command)
      println("x " + session.rovers.last.position.point.x + " y " + session.rovers.last.position.point.y + " direction " + session.rovers.last.position.direction)
    }
  }
}
