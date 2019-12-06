package me.mbcu.practice

object Leet extends App {
  // 自分の得意な言語で
  // Let's チャレンジ！！

  val line = scala.io.StdIn.readLine
  val list = line.toList

  val aaa = Map(
    "A" -> 4,
    "E" -> 3,
    "G" -> 6,
    "I" -> 1,
    "O" -> 0,
    "S" -> 5,
    "Z" -> 2
  ).withDefaultValue(-1)
  val res = list.map(_.toString).map(p => {
    val ref = aaa(p)
    if (ref != -1){
      ref
    }
    else {
      p
    }

  })

  println(res.mkString(""))

}