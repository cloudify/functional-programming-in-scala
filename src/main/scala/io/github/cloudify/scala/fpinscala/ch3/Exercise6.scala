package io.github.cloudify.scala.fpinscala.ch3

import io.github.cloudify.scala.fpinscala.datastructures._

object Exercise6 {

  // naive version, will overflow stack on big lists
  def init[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case Cons(y, Nil) => Nil
    case Cons(x, xs) => Cons(x, init(xs))
  }

}
