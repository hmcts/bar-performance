package uk.gov.hmcts.feesregister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object GetFeesRegisterByCategoryId {

  val getFeesRegisterByCategoriesIdHttp = http("get fees for calculation value")
    .get("/fees/X0250-1/calculations?value=20000")
    .check(status.is(200))

  val getFeesRegisterByCategoriesId = scenario("Get Fees for calculation value")
     .exec(
       getFeesRegisterByCategoriesIdHttp
     )
}
