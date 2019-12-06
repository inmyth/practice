package me.mbcu.practice

import java.io.File

object FileStuff extends App{

  val testCaseDirectory = getClass.getResource("/RocheFiles")
  val directory = new File(testCaseDirectory.getPath)

//  directory.listFiles.filter(_.isFile).foreach(println)
  directory.listFiles.toList.filter(_.isDirectory).flatMap(p => new File(p.getPath).listFiles).foreach(println)


val x =
  """
    |\
    |/
    |""".stripMargin

  println(x)

  val a = Int.box(100)
  val b = Int.box(100)
  println(a==b)
}
