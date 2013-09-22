package io.github.cloudify.scala.fpinscala.ch3

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class Exercise4Spec extends WordSpec with ShouldMatchers {
  import io.github.cloudify.scala.fpinscala.datastructures._
  import Exercise4._

  "dropWhile" should {

    "work on Nil list" in {
      dropWhile(Nil)((a: Int) => a > 0) should equal(Nil)
    }

    "work on single element list" in {
      dropWhile(Cons(1, Nil))(a => a > 0) should equal(Nil)
      dropWhile(Cons(1, Nil))(a => a > 1) should equal(Cons(1, Nil))
    }

    "work on multiple element list" in {
      dropWhile(Cons(2, Cons(1, Nil)))(a => a > 2) should equal(Cons(2, Cons(1, Nil)))
      dropWhile(Cons(2, Cons(1, Nil)))(a => a > 1) should equal(Cons(1, Nil))
      dropWhile(Cons(2, Cons(1, Nil)))(a => a > 0) should equal(Nil)
    }

  }

}

