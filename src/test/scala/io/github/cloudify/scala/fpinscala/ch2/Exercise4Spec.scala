package io.github.cloudify.scala.fpinscala.ch2

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.WordSpec

class Exercise4Spec extends WordSpec with ShouldMatchers {
  import Exercise4._

  "curry" should {

    "produce a function" in {
      val f = (a: Int, b: Int) => a + b

      val c = curry(f)
      c(1)(2) should equal(3)
    }

  }

}
