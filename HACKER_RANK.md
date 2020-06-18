## 1
You want to spend your next vacation in a foreign country. In the summer you are free for N 3 consecutive days. You have consulted Travel Agency and learned that they are offering a trip to some interesting location in the country every day. For simplicity, each location is identified by a number from 0 to N - 1. Trips are described in a non-empty array A: for each K (0 K < N), A[K] is the identifier of a location which is the destination of a trip offered on day K. Travel Agency does not have to offer trips to all locations, and can offer more than one trip to some locations. You want to go on a trip every day during your vacation. Moreover, you want to visit all locations offered by Travel Agency. You may visit the same location more than once, but you want to minimize duplicate visits. The goal is to find the shortest vacation (a range of consecutive days) that will allow you to visit all the locations offered by Travel Agency. 

For example, consider array A such that: 

A[0] = 7 

A[1] = 3 

A[2] = 7 

A[3] = 3 

A[4] = 1

A[5] = 3

A[6] = 4

A[7] = 1 

Travel Agency offers trips to four different locations (identified by numbers 1, 3, 4 and 7). The shortest vacation starting on day 0 that allows you to visit all these locations ends on day 6 (thus is seven days long). However, a shorter vacation of five days (starting on day 2 and ending on day 6) also permits you to visit all locations. On every vacation shorter than five days, you will have to miss at least one location. 

Write a function: 
```
object Solution { def solution(a: Array[Int]) : Int }
```

that, given a non-empty array A consisting of N integers, returns the length of the shortest vacation that allows you to visit all the offered locations. 

For example, given array A shown above, the function should return 5, as explained above. 

Given A = [2, 1, 1, 3, 2, 1, 1, 3], the function should return 3. One of the shortest vacations that visits all the places starts on day 3 (counting from 0) and lasts for 3 days. 

Given A = [7, 5, 2, 7, 2, 7, 4, 7], the function should return 6. The shortest vacation that visits all the places starts on day 1 (counting from 0) and lasts for 6 days. 

## 2

You are given an implementation of a function: 
``` 
object Solution { def solution(m: Int, a: Array[Int]) : Int } 
```

lothat, given an integer M and an array A consisting of N non-negative integers, which are not greater than M, returns the value (or one of the values) that occurs most often in this array. For example, given M -3 and array A such that 

A[0] = 1 

A[1] = 2 

A[2] = 3 

A[3] = 3 

A[4] = 1 

A[5] = 3 

A[6] = 1 


the function may retum 1 or 3. 

The attached code is still incorrect for some inputs. Despite the error(s), the code may produce a correct answer for the example test cases. The goal of the exercise istaled  and fix the bug(s) in the implementation. You can modify at most four lines.
 
Assume that: 

• N is an integer within the range n..200,0001: 
• M is an integer within the range [1..10,000]; 
• each element of array A is an integer within the range [0..M]. 

In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment. 

```
Fix this method to find occurences in an array

def solution(M: Int, A: Array[Int]): Int = {
  var N: Int = A.length;
  var count: Array[Int] = Array.fill(M + 1)(0);
  var maxOccurence: Int = 1;
  var index: Int = -1;
  var i: Int = 0;
  while (i < N) {
    if (count(A(i)) > 0) {
      var tmp: Int = count(A(i)) 
      if (tmp > maxOccurence) {
        maxOccurence = tmp;
        index = i;
      }
      count(A(i)) = tmp + 1
    }
    else {
      count(A(i)) = 1
    }
    i = i + 1;
  }
  return A(index);
}
```

## 3

When John gambles at the casino, he always uses a special system of tactics that he devised himself. Its based on always betting in one of two ways in each game: 

- betting exactly one chip (to test his luck); 
- betting all-in (he bets everything he has). 

Wins in the casino are paid equal to the wager, so if he bets C chips and wins, he gets 2C chips back. If he loses, he doesn't get any chips back.

It was a very lucky day yesterday and John won every game he played, starting with one chip and leaving the casino with N chips. We also know that John played all-in no more than K times. Your task is to calculate the smallest possible number of rounds he could have played. 

Note: betting just one chip is never considered playing all-in. 

Write a function:

``` 
object Solution { def solution(n: Int, k: Int): Int }
```

that, given an integer N and an integer K, returns the minimum number of rounds that are necessary for John to leave the casino with N chips, having played all-in no more than K times. 

Given N = 8 and K = 0, the answer is 7. K is 0 so John bets 1 chip in each round. The number of chips were as follows: 

at the beginning: 1 

after the 1st round: 2 (he bet 1) 

after the 2nd round: 3 (he bet 1) 

after the 3rd round: 4 (he bet 1) 

after the 4th round: 5 (he bet 1) 

after the 5th round: 6 (he bet 1) 

after the 6th round: 7 (he bet 1)
 
after the 7th round: 8 (he bet 1) 

he played all-in 0 times

Given N = 18 and K = 2, the answer is 6. The shortest game would be:

at the beginning: 1

after the 1st round: 2 (he bet 1) 

after the 2nd round: 3 (he bet 1)
 
after the 3rd round: 4 (he bet 1) 

after the 4th round: 8 (all-in) 

after the 5th round: 9 (he bet 1) 