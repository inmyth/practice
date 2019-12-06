package me.mbcu.practice

object TapeEquilibrium extends App{

  val A = Seq(3,1,2,4,3)
  val res = lesgo(A)
  println(res)

  def lesgo(A: Seq[Int]) = {
    val L = A.size
    val x = (1 until L).toList
      .map(p => {
        // 0 L A.size
        (A.slice(0, p).sum, A.slice(p, A.size).sum)


      })
        .map(p => Math.abs(p._1 - p._2))
        .min
    x


  }

}
