package com.knoldus.operation

class ListOperations {

  def operateList(list: List[Int], operation: String, f: List[Int] => Int): Int = {
    operation.toLowerCase match {
      case "sum" => {
        ListOperations.sumList(list)
      }
      case "product" => {
        ListOperations.productList(list)
      }
      case "max" => {
        ListOperations.maxFromList(list)
      }
    }
  }

}

object ListOperations {

  val sumList = (list: List[Int]) => {
    val sum = 0
    val oper = "sum"
    val result = recurseList(list, sum, oper)
    result
  }

  val productList = (list: List[Int]) => {
    val product = 1
    val oper = "product"
    val result = recurseList(list, product, oper)
    result

  }

  val maxFromList = (list: List[Int]) => {
    val max = 3
    val oper = "max"
    val result = recurseList(list, max, oper)
    result
  }

  def recurseList(list: List[Int], computer: Int, oper: String): Int = {

    oper match {
      case "sum" => {
        list match {
          case head :: tail => recurseList(tail, head + computer, oper)
          case head :: Nil => recurseList(Nil, head + computer, oper)
          case Nil => computer
        }
      }
      case "product" => {
        list match {
          case head :: tail => recurseList(tail, head * computer, oper)
          case head :: Nil => recurseList(Nil, head * computer, oper)
          case Nil => computer
        }
      }
      case "max" => {
        list match {
          case head :: head2 :: tail => {
            if (head >= head2) {
              recurseList(head :: tail, computer, oper)
            }
            else {
              recurseList(head2 :: tail, computer, oper)
            }
          }
          case head :: head2 :: tail => {
            if (head > head2) {
              head
            } else {
              head2
            }
          }
        }
      }
    }
  }
}
