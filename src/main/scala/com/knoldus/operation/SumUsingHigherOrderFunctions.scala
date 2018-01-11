package com.knoldus.operation

class SumUsingHigherOrderFunctions {

  def sum(f:(Int, Int) => Int, arg1: Int, arg2: Int): String = {

    val result: String = s"the result is ${f(arg1,arg2)}"
    result
  }

}
