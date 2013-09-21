package io.github.cloudify.scala.funscala

object Exercise2 {

  def isSorted[A](as: Array[A], gt: (A, A) => Boolean) : Boolean =
    if(as.size < 2) true else
      as.sliding(2).forall(a => gt(a(1), a(0)))


}
