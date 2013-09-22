package io.github.cloudify.scala.fpinscala.ch2

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class Exercise2Spec extends WordSpec with ShouldMatchers {
  import Exercise2.isSorted

  def gtInt(a: Int, b: Int): Boolean = a > b

  "isSorted" should {

    "return true on empty arrays" in {
      isSorted(Array.empty[Int], gtInt) should equal(true)
    }

    "return true on single element arrays" in {
      isSorted(Array(1), gtInt) should equal(true)
    }

    "return true on sorted arrays" in {
      isSorted(Array(1, 2, 3, 4), gtInt) should equal(true)
    }

    "return false on unsorted arrays" in {
      isSorted(Array(2, 3, 1, 4, 3), gtInt) should equal(false)
    }

  }

}
