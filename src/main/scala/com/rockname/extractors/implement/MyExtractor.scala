package com.rockname.extractors.implement

import com.rockname.extractors._


object MyExtractor {
  def main(args: Array[String]) = {
    println("[EMail Twice Uppercase extracotr]")
    println(userTwiceUpper("DIDI@hotmail.com"))
    println(userTwiceUpper("DIDO@hotmail.com"))
    println(userTwiceUpper("didi@hotmail.com"))

    println("[Domain extracotr]")
    println(isTomInDotCom("tom@sun.com"))

    println("[Expanded EMail extracotr]")
    val s = "tom@support.epfl.ch"
    val ExpandedEMail(name, topdom, subdoms @ _*) = s
    println("name: " + name + " topdom: " + topdom + " subdoms: " + subdoms)
  }

  def userTwiceUpper(s: String) = s match {
    case EMail(Twice(x @ UpperCase()), domain) =>
      "match " + x + " in domain " + domain
    case _ =>
      "no match"
  }

  def isTomInDotCom(s: String): Boolean = s match {
    case EMail("tom", Domain("com", _*)) => true
    case _ => false
  }
}
