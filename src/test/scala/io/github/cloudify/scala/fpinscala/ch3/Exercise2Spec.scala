package io.github.cloudify.scala.fpinscala.ch3

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.WordSpec

class Exercise2Spec extends WordSpec with ShouldMatchers {
  import io.github.cloudify.scala.fpinscala.datastructures._
  import Exercise2._

  "tail" should {

    "work on Nil list" in {
      tail(Nil) should equal(Nil)
    }

    "work on single element list" in {
      tail(Cons(1, Nil)) should equal(Nil)
    }

    "work on multiple element list" in {
      tail(Cons(2, Cons(1, Nil))) should equal(Cons(1, Nil))
    }

  }

}
