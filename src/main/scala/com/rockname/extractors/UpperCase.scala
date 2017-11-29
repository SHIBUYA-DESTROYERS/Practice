package com.rockname.extractors

object UpperCase {
  def unapply(s: String): Boolean = s.toUpperCase == s
}
