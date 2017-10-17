package uk.gov.hmcts.feesregister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetCMCPaperUnspecified {

  val getFeesRegisterHttp = http("get cmc paper unspecified")
                        .get("/range-groups/cmc-paper/calculations/unspecified")
                        .check(status is 200)

  val getAllCategories = scenario("Get cmc paper unspecified")
                .exec(getFeesRegisterHttp)
}
