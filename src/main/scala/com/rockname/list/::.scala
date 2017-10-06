package com.rockname.list

final case class ::[U](hd: U, private[scala] var tl: List[U]) extends List[U] {
  def head = hd
  def tail = tl

  override def isEmpty: Boolean = false
}
