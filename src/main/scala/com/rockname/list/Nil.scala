package com.rockname.list

case object Nil extends List[Nothing] {
  def isEmpty = true

  def head: Nothing = throw new NoSuchElementException("head of empty list")

  def tail: List[Nothing] = throw new NoSuchElementException("tail of empty list")
}
