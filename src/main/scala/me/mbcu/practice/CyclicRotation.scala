package me.mbcu.practice

object CyclicRotation extends App{


  // 3, 8, 9, 7, 6
  // 3, 8, 9, 7, 6,   3, 8, 9, 7, 6
  // 9, 7, 6, 3, 8

  val shift = 0
  val in = Seq(1, 10)
  val x = lesgo(in, shift)
  println(x)

  def lesgo(in: Seq[Int], shift: Int) = {
    var res :List[Int]  = null
    if(in.isEmpty){
      res= List.empty
    }
    else {
      val start = in.size - (shift%in.size)
      res = List.fill(2)(in).flatten.slice(start, start + in.size)
    }

    res
  }
}
