package uk.gov.hmcts.feesregister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object GetAppropriateFeesAmountForGivenClaim {

  val getFeesRegisterByCategoriesIdHttp = http("get all fees")
    .get("/fees")
    .check(status.is(200))

  val getAppropriateFeesAmountForGivenClaim = scenario("Get All Fees")
    .exec(
      getFeesRegisterByCategoriesIdHttp
    )

}
