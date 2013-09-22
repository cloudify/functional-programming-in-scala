package io.github.cloudify.scala.fpinscala.ch3

import io.github.cloudify.scala.fpinscala.datastructures._
import Exercise2.tail
import scala.annotation.tailrec

object Exercise3 {

  @tailrec
  def drop[A](l: List[A], n: Int): List[A] = if(n > 0) {
    drop(tail(l), n - 1)
  } else l

}
