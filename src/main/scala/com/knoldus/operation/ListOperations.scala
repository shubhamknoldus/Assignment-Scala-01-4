package com.knoldus.operation

class ListOperations {

  def operateList(list: List[Int], operation: String): Int = {

    val sum = (a: Int,b: Int) => a + b
    val product = (a: Int, b: Int) => a * b

    operation.toLowerCase match {
      case "sum" => {
        recurseList(list(0), list, sum)
      }
      case "product" => {
        recurseList(list(0), list, product)
      }
     /* case "max" => {
      }*/
    }
  }

  def recurseList(compute: Int, list:  List[Int], f: (Int, Int) => Int): Int =
  {
      list match {
        case head :: head2 :: tail => recurseList(f(head, head2), tail, f)
        case head :: head2 :: Nil => f(head2,compute) //why only this is not working
        case head :: Nil => compute
        case Nil => compute
      }
  }
}

