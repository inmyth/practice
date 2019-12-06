package me.mbcu.practice

object AvantThree extends App{

  val res1 = solution0(2, Array(1,2,3,3,1,3,1))
  println(res1)
//  val res2 = solution0(7, Array(1,4,4,3,1,3,1,4, 1, 5, 6, 6, 7,8,6,6, 7,6))
//  println(res2)

  def solution(M: Int, A: Array[Int]): Int = {
    var N: Int = A.length;
    var count: Array[Int] = Array.fill(M + 1)(0);
    var maxOccurence: Int = 1;
    var index: Int = -1;
    var i: Int = 0;
    while (i < N) {
      if (A(i) <= M) { // 1
        var tmp: Int = count(A(i)) + 1; //3
        if (tmp > maxOccurence) {
          maxOccurence = tmp;
          index = i;
        }
        count(A(i)) = tmp; //4
      }
      else {
//        count(A(i)) = 1; //2
      }
      i = i + 1;
    }
    return A(index);
  }

  def solution0(M: Int, A: Array[Int]): Int = {
    var N: Int = A.length;
    var count: Array[Int] = Array.fill(M + 1)(0);
    var maxOccurence: Int = 1;
    var index: Int = -1;
    var i: Int = 0;
    while (i < N) {
      if (count(A(i)) > 0) {
        var tmp: Int = count(A(i));
        if (tmp > maxOccurence) {
          maxOccurence = tmp;
          index = i;
        }
        count(A(i)) = tmp + 1;
      } else {
        count(A(i)) = 1;
      }
      i = i + 1;
    }
    return A(index);
  }

}

/*


    def solution(M: Int, A: Array[Int]): Int = {
        var N: Int = A.length;
        var count: Array[Int] = Array.fill(M + 1)(0);
        var maxOccurence: Int = 1;
        var index: Int = -1;
        var i: Int = 0;
        while (i < N) {
            if (count(A(i)) > 0) {
                var tmp: Int = count(A(i));
                if (tmp > maxOccurence) {
                    maxOccurence = tmp;
                    index = i;
                }
                count(A(i)) = tmp + 1;
            } else {
                count(A(i)) = 1;
            }
            i = i + 1;
        }
        return A(index);
    }
 */
