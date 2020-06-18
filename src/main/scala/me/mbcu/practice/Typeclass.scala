package me.mbcu.practice

object Typeclass {

  implicit val userHasId: HasId[User] = new HasId[User] {
    override def getId(a: User): Int = a.id
  }

  def printId[A](a: A)(implicit hia: HasId[A]): Unit =
    println(s"Found id ${hia.getId(a)}")


  printId(User(5, "aaa"))
}

final case class User(id: Int, name: String)

trait HasId[A] {
  def getId(a: A): Int
}
