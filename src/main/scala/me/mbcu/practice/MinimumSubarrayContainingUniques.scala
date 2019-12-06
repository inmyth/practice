package me.mbcu.practice

import scala.util.control.Breaks

// Avant test two
object MinimumSubarrayContainingUniques extends App{

  /*
  Find subarray that the contains all the unique elements in the array

  - create a flexible window both right and left sides start at 0
  - right side will slide all the way to the end of array, incrementing each unique in a map while counting total of this total
  - if the map.size and total count is larger than the number of uniques, start sliding left side to the right side to remove duplicates

   */
  var A = Seq(7,3,7,3,1,3,4,1) // 5 (2,6) 7,3,1,3,4
  A = Seq(2,1,1,3,2,1,1,3) // 3 (2, 4) 1,3,2
  A = Seq(7,5,2,7,2,7,4,7) // 6  (1, 7) 5,2,7,2,7,4
  A = Seq(1,1,1)
  val res = lesgo(A)
  println(res)

  def lesgo(A: Seq[Int]) = {
    val minSize = A.distinct.size
    var right = 0 // window will expand and contract until the we get minimum length containing unique elements
    var left = 0
    val map : scala.collection.mutable.Map[Integer, Integer] = scala.collection.mutable.Map.empty
    var count = 0
    val loop1 = new Breaks
    val loop2 = new Breaks
    var res = A
    loop1.breakable {
      while (right < A.size) {
        val last = A(right)
        if (map.contains(last)) {
          map.addOne(last, map(last) + 1)
        }
        else {
          map.addOne(last, 1)
        }
        count = count + 1

        if (map.size == minSize) { // test unique count and total count
          if (count > minSize){
            loop2.breakable {
              while (left < right) { // remove dupes, break if the element's count is 1
                val first = A(left)
                if (map(first) == 1) {
                  loop2.break
                }
                else {
                  map.addOne(first, map(first) - 1)
                  count = count - 1
                }
                left = left + 1
              }
            }
            if (count < res.size){
              res = A.slice(left, right + 1)
            }
            if (count == minSize) {
              loop1.break
            }
          }
        }
        right = right + 1
      }
    }
    res
  }

  // this is brute force
  def solution(a: Array[Int]): Int = {
    val uniq = a.distinct.toSet
    val minWindow = uniq.size
    var window = a.length
    var score = Integer.MAX_VALUE

    while (window >= minWindow){
      var start = 0
      var end = start + window
      while(end <= a.length){
        val sub = a.slice(start, end)
        if (sub.distinct.toSet == uniq) {
          score = Math.min(score, sub.size)
        }
        end = end + 1
        start = start + 1
      }
      window = window - 1
    }
    score
  }

}
