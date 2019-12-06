package me.mbcu.practice

object FacebookShiftZero extends App {

  // shift all zeros to the right


  var A = Array(0,1,0,3,12)
  A = Array(1,2)
  print(lesgo(A))

  def lesgo(A: Array[Int]) = {
    var idLastNonZero = 0

    for (i <- 0 until A.length){
      if(A(i) != 0){
        if (i != idLastNonZero){
          A(idLastNonZero) = A(i)
          A(i) = 0
        }
        idLastNonZero = idLastNonZero + 1
      }
    }
    A.toList


  }


}
