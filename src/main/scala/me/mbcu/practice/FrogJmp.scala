package me.mbcu.practice

object FrogJmp extends App{

  val X = 10
  val Y = 80
  val D = 30
  val res = lesgo(X, Y, D)
  print(res)

  def lesgo(X: Int, Y: Int, D: Int) =
    ((Y - X) / D ) + (if ((Y- X)% D == 0) 0 else 1 )




}
