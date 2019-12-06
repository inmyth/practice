package me.mbcu.practice

object PermMissingElem extends App{

  val in = Seq(2,3,1,5)
  val res = lesgo(in)
  println(res)

  def lesgo(in: Seq[Int]) : Int = {

    val min = in.min
    val max = in.max
    (min to max).sum - in.sum



  }


}
