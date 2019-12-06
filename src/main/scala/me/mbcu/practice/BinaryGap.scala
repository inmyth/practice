package me.mbcu.practice

object BinaryGap extends App{

  val in = 1041
  val res = dgap(in)
  print(res)

  def bgap(in: Int): Int ={
    val a = Integer.toBinaryString(in)
    //10000010001

    var longest = 0;
    var startIndex = -1
    for(i <- 0 until a.length){
      if (a.charAt(i) == '0' && startIndex == -1){
        startIndex = i
      }
      else if (a.charAt(i) != '0' && startIndex != -1) {
          longest = Integer.max(longest, i - startIndex)
          startIndex = -1
      }

    }

  longest
  }

  def dgap(in: Int): Int = {
    var n = in
    var longest = 0
    var localLongest = 0
    var isStillGap = false
    while (n > 0){
      if(isOne(n)){
        if(isStillGap){
          longest = Integer.max(longest, localLongest)
          localLongest = 0
          isStillGap = false
        }
      }
      else {
        isStillGap = true
        localLongest = localLongest + 1
      }
      n = n / 2
    }
  longest
  }

  def isOne(n: Int): Boolean = n%2 == 1 || n == 1
}

