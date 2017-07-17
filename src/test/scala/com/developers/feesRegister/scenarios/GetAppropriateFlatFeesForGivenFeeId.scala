package com.developers.feesRegister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetAppropriateFlatFeesForGivenFeeId {

  val getFeesRegisterByCategoriesIdHttp = http("get Appropriate FlatFees For Given FeeId")
    .get("/fees-register/categories/hearingfees/flat/X0046")
    .check(status.is(200))

  val getAppropriateFlatFeesForGivenFeeId = scenario("Get Appropriate FlatFees For Given FeeId")
    .exec(
      getFeesRegisterByCategoriesIdHttp
    )


}
