package com.rockname.list

import scala.collection.mutable.ListBuffer

abstract class List[+T] {
  def isEmpty: Boolean

  def head: T

  def tail: List[T]

  def ::[U >: T](x: U): List[U] = {
    new ::(x, this)
  }

  def :::[U >: T](prefix: List[U]): List[U] = {
    if (prefix.isEmpty) this
    else prefix.head :: prefix.tail ::: this
  }

  def length: Int = {
    if (isEmpty) 0 else 1 + tail.length
  }

  def drop(n: Int): List[T] = {
    if (isEmpty) Nil
    else if (n <= 0) this
    else tail.drop(n - 1)
  }

  def map[U](f: T => U): scala.List[U] = {
    val b = new ListBuffer[U]
    var these = this
    while (!these.isEmpty) {
      b += f(these.head)
      these = these.tail
    }
    b.toList
  }
}
