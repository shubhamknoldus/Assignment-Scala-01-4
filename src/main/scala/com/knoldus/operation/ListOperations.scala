package com.knoldus.operation

class ListOperations {

  def operateList(list: List[Int], operation: String): Int = {

    val sum = (a: Int,b: Int) => a + b
    val product = (a: Int, b: Int) => a * b
    val max = (a: Int, b: Int) => if(a >= b) {
      a
    } else {
      b
    }

    operation.toLowerCase match {
      case "sum" => {
        recurseList(0, list, sum)
      }
      case "product" => {
        recurseList(1, list, product)
      }
      case "max" => {
        recurseList(list(0), list, max)
      }
    }
  }

  def recurseList(compute: Int, list:  List[Int], f: (Int, Int) => Int): Int =
  {
      list match {
        case Nil => compute
        case head :: tail => recurseList(f(compute, head), tail, f)
      }
  }
}

