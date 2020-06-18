package me.mbcu.practice

object ABC extends App{

  
//  import scala.collection.mutable.Map
//  val cache : Map[Long, String] = Map.empty.withDefaultValue("")
//
//  val line = scala.io.StdIn.readLine.split(" ")
//  val k = line(0).toInt
//  val s = line(1).toLong
//  val t = line(2).toLong
//
//  var i = 1
//  var length: Long = 0
//  while (i <= k){
//    i += 1
//    length = 3 + (length * 2)
//  }
//
//  def find(a: Long, c: Long, pos: Long): String = {
//    val b = (a + c) / 2
//    cache += (a -> "A")
//    cache += (b -> "B")
//    cache += (c -> "C")
//
//    if (a == pos || b == pos || c == pos){
//      if (a == pos) return  "A"
//      else if (b == pos) return "B"
//      else return "C"
//    }
//    else {
//      if(pos > a && pos < b){
//        find(a + 1, b - 1, pos)
//      }
//      else {
//        find(b + 1, c - 1, pos)
//      }
//    }
//  }
//
//  val res =
//    (s-1 until t).map(p => {
//    if (cache(p) != "") cache(p)
//    else find(0L, length - 1, p)
//  }).mkString("")
//  println(res)





//      val res = (123-1 until 139).map(p => rec(0, length - 1, p))
//      println(res.mkString(""))
//      def rec(a: Long, c: Long, pos: Long): String = {
//          if (a == c) {
//             return ""
//          }
//          val b = (a + c) / 2
//          if (a == pos || b == pos || c == pos){
//            if (a == pos) return  "A"
//            else if (b == pos) return "B"
//            else return "C"
//          }
//          else {
//            if(pos > a && pos < b){
//              rec(a + 1, b - 1, pos)
//            }
//            else {
//              rec(b + 1, c - 1, pos)
//            }
//          }
//        }


}
/*
object Main extends App {
    // 自分の得意な言語で
    // Let's チャレンジ！！

    val line = scala.io.StdIn.readLine.split(" ")
    val LEVEL = line.head.toInt
    val s = line(1).toInt
    val t = line(2).toInt

    val res = rec(LEVEL , s, t)
    println(res)

    def rec(LEVEL: Int, s: Int, t: Int) = {

        var abc = ""
        var l = 1

        while(l <= LEVEL){
            abc = s"A${abc}B${abc}C"
            l = l + 1
        }
        abc.substring(s-1,t)

    }
}
 */

/*
WORKING CODE
 val line = scala.io.StdIn.readLine.split(" ")
    val LEVEL = line.head.toInt
    val s = line(1).toLong
    val t = line(2).toLong

    var l = 1
    var length: Long = 0
    while (l <= LEVEL){
      length = (length * 2) + 3
      l = l  + 1
    }


    def rec(a: Long, c: Long, pos: Long): String = {
      val b = (a + c) / 2
      if (a == pos || b == pos || c == pos){
        if (a == pos) return  "A"
        else if (b == pos) return "B"
        else return "C"
      }
      else {
        if(pos > a && pos < b){
          rec(a + 1, b - 1, pos)
        }
        else {
          rec(b + 1, c - 1, pos)
        }
      }
    }

      val res = (s-1 until t).map(p => rec(0L, length - 1, p))
      println(res.mkString(""))
 */

/* BETTER WORKING CODE
 val line = scala.io.StdIn.readLine.split(" ")
    val LEVEL = line.head.toInt
    val s = line(1).toLong
    val t = line(2).toLong

        var l: Long = 1L
      var length: Long = 0
      while (l <= LEVEL){
        length = (length * 2) + 3
        l = l  + 1
      }

      import scala.collection.mutable.Map
      val memo : Map[Long, String] = Map.empty.withDefaultValue("")

      def rec(a: Long, c: Long, pos: Long): String = {
        val b = (a + c) / 2
        memo += (a -> "A")
        memo += (b -> "B")
        memo += (c -> "C")

        if (a == pos || b == pos || c == pos){
          if (a == pos) return  "A"
          else if (b == pos) return "B"
          else return "C"
        }
        else {
          if(pos > a && pos < b){
            rec(a + 1, b - 1, pos)
          }
          else {
            rec(b + 1, c - 1, pos)
          }
        }
      }

      val res = (s-1 until t).map(p => {
        if (memo(p) != ""){
          memo(p)
        }
        else {
          rec(0L, length - 1, p)
        }
      })
      println(res.mkString(""))

 */