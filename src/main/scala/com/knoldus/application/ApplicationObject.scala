package com.knoldus.application

import org.apache.log4j.Logger
import com.knoldus.operation.SumUsingHigherOrderFunctions
import com.knoldus.operation.ListOperations

object ApplicationObject extends App {

  val arg1 = 6
  val arg2 = 7
  val logger = Logger.getLogger(this.getClass)
  val sumSquare = (a: Int, b: Int) => ((a * a) + (b * b))
  val sumCubes = (a: Int, b: Int) => ((a * a * a) + (b * b * b))
  val sumInts = (a: Int, b: Int) => (a + b)

  val sumObject = new SumUsingHigherOrderFunctions

  logger.info(sumObject.sum(sumSquare, arg1, arg2) + "\n")
  logger.info(sumObject.sum(sumCubes, arg1, arg2) + "\n")
  logger.info(sumObject.sum(sumInts, arg1, arg2) + "\n")

  val arg3 = 34
  val arg8 = 43
  val arg7 = 97
  val arg6 = 18
  val arg5 = 21
  val arg4 = 62

  val list = List(arg2,arg1,arg3,arg4,arg5,arg6,arg7,arg8)
  val listOper: List[String] = List("sum","product","max")

  val obj = new ListOperations
  logger.info(obj.operateList(list, listOper(0)))

}
