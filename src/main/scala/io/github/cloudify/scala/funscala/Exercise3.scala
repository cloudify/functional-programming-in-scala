package io.github.cloudify.scala.funscala

object Exercise3 {

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = (b: B) => f(a, b)

}
