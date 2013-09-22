package io.github.cloudify.scala.fpinscala.ch3

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class Exercise5Spec extends WordSpec with ShouldMatchers {
  import io.github.cloudify.scala.fpinscala.datastructures._
  import Exercise5._

  "setHead" should {

    "not replace in empty list" in {
      setHead(Nil, 1) should equal(Nil)
    }

    "replace head of single element list" in {
      setHead(Cons(1, Nil), 2) should equal(Cons(2, Nil))
    }

    "replace head of multiple element list" in {
      setHead(Cons(2, Cons(1, Nil)), 5) should equal(Cons(5, Cons(1, Nil)))
    }

  }

}

