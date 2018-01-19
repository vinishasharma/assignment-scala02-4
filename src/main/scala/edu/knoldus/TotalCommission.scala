package edu.knoldus

import Total._

class TotalCommission {
  def getTotalCommission[T <: Commission](commissionList: List[T]): String ={
    commissionList.totalDisplayCommission
  }
}
