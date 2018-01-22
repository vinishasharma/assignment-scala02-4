package edu.knoldus

import org.apache.log4j.Logger

object OperationCall {

  def main(args: Array[String]): Unit = {

    val log = Logger.getLogger(this.getClass)
    val totalCommission = new TotalCommission
    val clientCommission1 = new ClientSideCommission(3)
    val clientCommission2 = new ClientSideCommission(3)
    val clientCommissionList = List(clientCommission1, clientCommission2)
    val clientCommission = totalCommission.getTotalCommission[ClientSideCommission](clientCommissionList)
    log.info(clientCommission)

    val streetCommission1 = new StreetSideCommission(2)
    val streetCommissionList = List(streetCommission1)
    val streetCommission = totalCommission.getTotalCommission[StreetSideCommission](streetCommissionList)
    log.info(s"\n$streetCommission")

    val mixedList = List(clientCommission1, streetCommission1)
    val commission = totalCommission.getTotalCommission[Commission](mixedList)
    log.info(s"\n$commission")
  }
}
