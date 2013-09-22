package io.github.cloudify.scala.fpinscala.ch3

import io.github.cloudify.scala.fpinscala.datastructures._

object Exercise2 {

  def tail[A](xs: List[A]): List[A] = xs match {
    case Nil => Nil
    case Cons(h, Nil) => Nil
    case Cons(h, t) => t
  }

}
