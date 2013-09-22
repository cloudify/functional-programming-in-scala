package io.github.cloudify.scala.fpinscala.ch3

import io.github.cloudify.scala.fpinscala.datastructures._
import scala.annotation.tailrec

object Exercise4 {

  @tailrec
  def dropWhile[A](l: List[A])(f: A => Boolean): List[A] = l match {
    case Nil => Nil
    case Cons(x, xs) if f(x) => dropWhile(xs)(f)
    case _ => l
  }

}
