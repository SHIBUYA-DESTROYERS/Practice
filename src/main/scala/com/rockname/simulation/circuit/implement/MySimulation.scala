package com.rockname.simulation.circuit.implement

import com.rockname.simulation.circuit._

object MySimulation extends CircuitSimulation {
  override def InverterDelay = 1

  override def AndGateDelay = 3

  override def OrGateDelay = 5

  val input1, input2, sum, carry = new Wire

  def main(args: Array[String]) = {
    probe("sum", sum)
    probe("carry", carry)
    halfAdder(input1, input2, sum, carry)
    input1 setSignal true
    run()
    input2 setSignal true
    run()
  }
}
