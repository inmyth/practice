package me.mbcu.practice

import scala.util.Try

object ReverseInteger extends App {

  val i : Int = -2147483412;


  val isMin = i < 0
  val r = Try(Math.abs(i).toString.toCharArray.reverse.mkString("").toInt).getOrElse(0)
  val res = if(isMin) r * -1 else r

  println(i % 10000)

  def tes(in : Int): Unit = {

  }
}
