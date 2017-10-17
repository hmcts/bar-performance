package uk.gov.hmcts.feesregister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetAllFlatFeesForGivenCategory {

  val getFeesRegisterByCategoriesIdHttp = http("get all FlatFees For Given Category")
    .get("/categories/cmc-online")
    .check(status.is(200))

  val getAllFlatFeesForGivenCategory = scenario("Get all FlatFees For Given Category")
    .exec(
      getFeesRegisterByCategoriesIdHttp
    )
}
