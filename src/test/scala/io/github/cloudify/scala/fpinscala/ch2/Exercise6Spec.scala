package io.github.cloudify.scala.fpinscala.ch2

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class Exercise6Spec extends WordSpec with ShouldMatchers {
  import Exercise6._

  "compose" should {

    "produce a function" in {
      val f = (a: Int) => "res: " + a
      val g = (a: Int) => a + 1

      val c = compose(f, g)
      c(1) should equal("res: 2")
    }

  }

}

