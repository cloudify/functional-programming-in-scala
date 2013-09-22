package io.github.cloudify.scala.fpinscala.ch2

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class Exercise5Spec extends WordSpec with ShouldMatchers {
  import Exercise5._

  "uncurry" should {

    "produce a function" in {
      val f = (a: Int) => (b: Int) => a + b

      val c = uncurry(f)
      c(1, 2) should equal(3)
    }

  }

}

