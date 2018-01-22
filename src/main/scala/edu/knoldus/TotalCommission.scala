package edu.knoldus

import Total._
import scala.reflect.runtime.universe._

class TotalCommission {
  def getTotalCommission[T <: Commission: TypeTag](commissionList: List[T]): String ={
    commissionList.totalDisplayCommission
  }
}
