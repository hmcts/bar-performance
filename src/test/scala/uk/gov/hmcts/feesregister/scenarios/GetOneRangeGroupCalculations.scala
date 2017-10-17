package uk.gov.hmcts.feesregister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetOneRangeGroupCalculations {

  val getFeesRegisterHttp = http("get one range group calculations")
                        .get("/range-groups/cmc-paper/calculations?value=100000000")
                        .check(status is 200)

  val getAllCategories = scenario("Get One Range Group Calculations")
                .exec(getFeesRegisterHttp)
}
