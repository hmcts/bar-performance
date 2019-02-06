package uk.gov.hmcts.feesregister.simulation

import uk.gov.hmcts.feesregister.util.DevEnvironment
import uk.gov.hmcts.feesregister.util.Headers
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import uk.gov.hmcts.feesregister.scenarios.GetCMCPaperUnspecified
import uk.gov.hmcts.feesregister.scenarios._
import uk.gov.hmcts.feesregister.util.{DevEnvironment, Headers}

class FeesRegisterSimulation extends Simulation {

  val httpConf = http.baseURL(DevEnvironment.baseURL)
                      .headers(Headers.commonHeader)

  val feesRegisterScenarios = List(

    GetCMCPaperUnspecified.getAllCategories.inject(
      atOnceUsers(1),
      rampUsersPerSec(1) to 100 during(300 seconds)
    )


  )

  setUp(feesRegisterScenarios)
    .protocols(httpConf)
    .maxDuration(1 minutes)
    .assertions(
      global.responseTime.max.lessThan(DevEnvironment.maxResponseTime.toInt)
    )
}