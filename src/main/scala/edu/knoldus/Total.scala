package edu.knoldus

object Total {

  sealed trait CommissionDisplay {
    def totalDisplayCommission: String
  }

  implicit def calculateCommission[T <: Commission](commissionList: List[T]): String = {
    val total = 5
    commissionList match {
      case clientCommissionList: List[ClientSideCommission] => s"The total client commission is: $total"
      case streetCommissionList: List[StreetSideCommission] => s"The total street commission is: $total"
      case commissionList: List[Commission] => s"The total mingled commission is: $total"
    }
  }

  implicit class TotalCommissionDisplay[T <: Commission](commissionList: List[T]) extends CommissionDisplay {

    def totalDisplayCommission: String = {
      commissionList
    }
  }

}
