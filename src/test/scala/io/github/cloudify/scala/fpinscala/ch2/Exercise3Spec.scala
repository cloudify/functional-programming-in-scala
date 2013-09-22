package io.github.cloudify.scala.fpinscala.ch2

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.WordSpec

class Exercise3Spec extends WordSpec with ShouldMatchers {
  import Exercise3._

  "partial1" should {

    "compose a partial function" in {
      val f = partial1(1, (a: Int, b: Int) => a + b)
      f(2) should equal(3)
    }

  }

}
