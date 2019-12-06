package me.mbcu.practice

object HitoriSugoroku extends App{
    // 自分の得意な言語で
    // Let's チャレンジ！！

    val tbudlr = scala.io.StdIn.readLine.split(" ").toArray.map(_.toInt).zipWithIndex.toMap
    val boardLength = scala.io.StdIn.readLine.toInt
    val board = (0 until boardLength).map(_ => scala.io.StdIn.readLine.toInt).toArray

    var i = 0
    var ans = 0

    while (i < board.length) {
      if (i > 0){
        val diceTopNow = tbudlr(board(i))
        val diceTopPrev = tbudlr(board(i - 1))

        if ((diceTopNow == 0 && diceTopPrev == 1) || (diceTopNow == 1 && diceTopPrev == 0) ||
          (diceTopNow == 2 && diceTopPrev == 3) || (diceTopNow == 3 && diceTopPrev == 2) ||
          (diceTopNow == 4 && diceTopPrev == 5) || (diceTopNow == 5 && diceTopPrev == 4)
        ){
          ans = ans + 2
        }
        else if (diceTopNow == diceTopPrev){
          ans = ans + 0;
        }
        else {
          ans = ans + 1
        }

      }
      i = i + 1

    }
    println(ans)

}
