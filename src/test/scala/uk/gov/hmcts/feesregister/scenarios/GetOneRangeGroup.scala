package uk.gov.hmcts.feesregister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetOneRangeGroup {

  val getFeesRegisterHttp = http("get one range group")
                        .get("/range-groups/cmc-paper")
                        .check(status is 200)

  val getAllCategories = scenario("Get one range group")
                .exec(getFeesRegisterHttp)
}
