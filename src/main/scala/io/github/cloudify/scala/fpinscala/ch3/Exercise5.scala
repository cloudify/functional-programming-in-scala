package io.github.cloudify.scala.fpinscala.ch3

import io.github.cloudify.scala.fpinscala.datastructures._

object Exercise5 {

  def setHead[A](l: List[A], a: A): List[A] = l match {
    case Nil => Nil
    case Cons(x, xs) => Cons(a, xs)
  }

}
