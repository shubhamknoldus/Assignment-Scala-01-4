package com.knoldus.application

import org.apache.log4j.Logger
import com.knoldus.operation.SumUsingHigherOrderFunctions
import com.knoldus.operation.ListOperations

object ApplicationObject extends App {

  val arg1 = 6
  val arg2 = 7
  val arg3 = 3
  val arg4 = 6
  val arg5 = 2
  val arg6 = 1
  val arg7 = 9
  val arg8 = 4

  val logger = Logger.getLogger(this.getClass)
  val sumSquare = (a: Int, b: Int) => ((a * a) + (b * b))
  val sumCubes = (a: Int, b: Int) => ((a * a * a) + (b * b * b))
  val sumInts = (a: Int, b: Int) => (a + b)

  val sumObject = new SumUsingHigherOrderFunctions

  logger.info(sumObject.sum(sumSquare, arg1, arg2) + "\n")
  logger.info(sumObject.sum(sumCubes, arg1, arg2) + "\n")
  logger.info(sumObject.sum(sumInts, arg1, arg2) + "\n")


  val list = List(arg2,arg1,arg3,arg4,arg5,arg6,arg7,arg8)
  val listOper: List[String] = List("sum","product","max")

  val obj = new ListOperations
  logger.info(obj.operateList(list, listOper(0)) + "\n")
  logger.info(obj.operateList(list, listOper(2)) + "\n")
  logger.info(obj.operateList(list, listOper(1)) + "\n")

}
