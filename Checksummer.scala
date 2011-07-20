package chp1-9

import ChecksumAccumulator.calculate

object Checksummer {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}

// vim: set ts=4 sw=4 et:
