package com.developers.feesRegister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object GetAppropriateFeesAmountForGivenClaim {

  val getFeesRegisterByCategoriesIdHttp = http("get Appropriate Fees Amount For Given Claim")
    .get("/fees-register/categories/hearingfees/ranges/2000/fees")
    .check(status.is(200))

  val getAppropriateFeesAmountForGivenClaim = scenario("Get Appropriate Fees Amount For Given Claim")
    .exec(
      getFeesRegisterByCategoriesIdHttp
    )

}
