package me.mbcu.practice

object ScalaREPL extends App{

  val x = Array(0, 5, 2).toSeq.map(p => (p, p * p ))
    .sortBy(_._2)
      .toArray
  print(x)


}
