sealed trait LinkedList[A] {
  def ::(a: A): LinkedList[A] = LinkedList.::(a, this)
}
object LinkedList {
  final case class ::[A](head: A, tail: LinkedList[A])
      extends LinkedList[A]
  final case class Nil[A]() extends LinkedList[A]
}
