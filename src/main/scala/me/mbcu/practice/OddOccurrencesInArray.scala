package me.mbcu.practice

object OddOccurrencesInArray extends App{

  val in = Array(9, 3, 9, 3, 9, 7)
  val res = lesgo(in)
  print(res)

  def lesgo(in: Array[Int]): Int ={
    import util.control.Breaks._

    val cache : scala.collection.mutable.Map[Integer, Integer] = scala.collection.mutable.Map.empty

    var res = -1
    for (i <- 0 until in.length) {
      val e = in(i)
      if (cache.contains(e)){
        cache.addOne(e, cache(e) + 1)
      }
      else {
        cache.addOne(e, 1)
      }
    }

    breakable {
      for (i <- 0 until in.length) {
        val e = in(i)
        if (cache(e) == 1){
          res = e
          break
        }

      }
    }
    res
  }



}
