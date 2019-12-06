package me.mbcu.practice

object PermCheck extends App{

  val A = Seq(1,3,2,5)
  val res = lesgo(A)
  print(res)

  def lesgo(A: Seq[Int]) = {

    val x = (1 to A.size).toList.sum
    if (A.sum != x) 0 else 1


  }


}
