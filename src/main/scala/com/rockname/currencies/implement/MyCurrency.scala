package com.rockname.currencies.implement

import com.rockname.currencies._

object MyCurrency {
  def main(args: Array[String]) = {
    val d2y = Japan.Yen from US.Dollar * 100
    println("Yen from 100 Dollar = " + d2y)
    val y2e = Europe.Euro from d2y
    println("Euro from " + d2y + " Yen = " + y2e)
    val e2d = US.Dollar from y2e
    println("Dollar from " + y2e + " Euro = " + e2d)
  }
}