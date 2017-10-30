package com.rockname.sandbox

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Sandbox {
  def main(args: Array[String]) = {
    val someNum = Some(1)
    val none: Option[Int] = None
    val num = for {
      num1 <- Some(1).filter(a => false)
      num2 <- {
        print(num1)
        Some(num1)
      }
    } yield num2
    print(num)
  }
}
