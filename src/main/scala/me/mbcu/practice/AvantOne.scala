package me.mbcu.practice

object AvantOne extends App{

  val res1 = solution(10, 10)
  println(res1)
  val res2 = solution(18, 2)
  println(res2)
  val res3 = solution(8, 0)
  println(res3)
  val res4 = solution(0, 0)
  print(res4)


  def solution(n: Int, k: Int): Int = {
    var N = n
    var K = 0
    var steps = 0

    if (N == 1){
      return 0
    }

    while(N > 2){
      if (N%2 == 1){
        N = N - 1
        steps = steps + 1
      }
      else {
        if (K < k){
          K = K + 1
          N = N / 2
          steps = steps + 1
        }
        else{
          steps = steps + 1
          N = N - 1
        }
      }
    }
    steps = steps + 1
    steps
  }
}
