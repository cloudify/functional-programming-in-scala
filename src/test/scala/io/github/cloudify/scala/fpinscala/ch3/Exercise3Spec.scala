package io.github.cloudify.scala.fpinscala.ch3

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class Exercise3Spec extends WordSpec with ShouldMatchers {
  import io.github.cloudify.scala.fpinscala.datastructures._
  import Exercise3._

  "drop" should {

    "work on Nil list" in {
      drop(Nil, 3) should equal(Nil)
    }

    "work on single element list" in {
      drop(Cons(1, Nil), 3) should equal(Nil)
    }

    "work on multiple element list" in {
      drop(Cons(2, Cons(1, Nil)), 0) should equal(Cons(2, Cons(1, Nil)))
      drop(Cons(2, Cons(1, Nil)), 1) should equal(Cons(1, Nil))
      drop(Cons(2, Cons(1, Nil)), 2) should equal(Nil)
    }

  }

}

