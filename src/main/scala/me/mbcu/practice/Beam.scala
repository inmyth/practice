package me.mbcu.practice

import scala.collection.mutable.ListBuffer

object Beam extends App {
//  val columns = scala.io.StdIn.readLine.split(" ").head.toInt
//  val box = (0 until columns).map(_ => scala.io.StdIn.readLine.toArray).toArray

//  __\_/
//    ___/_
//  \/\_/

  val s = """__\_/"""
  val box : ListBuffer[Array[Char]] = ListBuffer.empty
//
//  box.addOne("""__\_/""".toArray)
//  box.addOne("""___/_""".toArray)
//  box.addOne("""\/\_/""".toArray)
  box.addOne("""_\""".toArray)
  box.addOne("""//""".toArray)
  box.addOne("""\/""".toArray)

  val ans = solve(box.toArray)
  println(ans)
  def solve(box: Array[Array[Char]]) = {

    object Direction extends Enumeration {
      type Direction = Value
      val RIGHT, DOWN, LEFT, UP = Value
    }

    var col = 0
    var row = 0
    var direction = Direction.RIGHT
    var count = 0

    while (col >= 0 && col < box.length&& row >= 0 && row < box(0).length){
      val cell = box(col)(row).toString
      count = count + 1
      if (cell == """\"""){
          direction match {
            case Direction.LEFT =>
              col = col - 1
              direction = Direction.UP

            case Direction.UP =>
              row = row - 1
              direction = Direction.LEFT

            case Direction.RIGHT =>
              col = col + 1
              direction = Direction.DOWN

            case _ =>
              row = row + 1
              direction = Direction.RIGHT
          }
      }
      else if (cell == """/"""){
        direction match  {
          case Direction.LEFT =>
            col = col + 1
            direction = Direction.DOWN

          case Direction.UP =>
            row = row + 1
            direction = Direction.RIGHT

          case Direction.RIGHT =>
            col = col - 1
            direction = Direction.UP

          case _ =>
            row = row - 1
            direction = Direction.LEFT
        }

      } else {
        direction match {

          case Direction.LEFT => row = row - 1
          case Direction.UP => col = col -1
          case Direction.RIGHT => row = row + 1
          case _ =>  col = col + 1
        }
      }
    }
    count

  }




}