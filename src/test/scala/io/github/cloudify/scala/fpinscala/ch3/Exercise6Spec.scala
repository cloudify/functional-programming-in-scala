package io.github.cloudify.scala.fpinscala.ch3

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class Exercise6Spec extends WordSpec with ShouldMatchers {
  import io.github.cloudify.scala.fpinscala.datastructures._
  import Exercise6._

  "init" should {

    "return empty list" in {
      init(Nil) should equal(Nil)
    }

    "return Nil on single element list" in {
      init(Cons(1, Nil)) should equal(Nil)
    }

    "drop last element of multiple element list" in {
      init(Cons(2, Cons(1, Nil))) should equal(Cons(2, Nil))
    }

  }

}

