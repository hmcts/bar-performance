package uk.gov.hmcts.feesregister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetAllRangeGroups {

  val getFeesRegisterHttp = http("get all Range Groups")
                        .get("/range-groups")
                        .check(status is 200)

  val getAllCategories = scenario("Get All Range Groups")
                .exec(getFeesRegisterHttp)
}
