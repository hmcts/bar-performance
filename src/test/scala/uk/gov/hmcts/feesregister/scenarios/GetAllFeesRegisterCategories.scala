package uk.gov.hmcts.feesregister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetAllFeesRegisterCategories {

  val getFeesRegisterByCategoriesIdHttp = http("get all FeesRegister Categories")
    .get("/categories")
    .check(status.is(200))

  val getAllFeesRegisterCategories = scenario("Get all FeesRegister Categories")
    .exec(
      getFeesRegisterByCategoriesIdHttp
    )

}
