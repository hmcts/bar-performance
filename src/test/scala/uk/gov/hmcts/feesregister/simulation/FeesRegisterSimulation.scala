package uk.gov.hmcts.feesregister.simulation

import uk.gov.hmcts.feesregister.util.DevEnvironment
import uk.gov.hmcts.feesregister.util.Headers
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import uk.gov.hmcts.feesregister.scenarios.GetAllFeesRegister
import uk.gov.hmcts.feesregister.scenarios.GetFeesRegisterByCategoryId
import uk.gov.hmcts.feesregister.scenarios.GetAllFeesRegisterCategories
import uk.gov.hmcts.feesregister.scenarios.GetAllFlatFeesForGivenCategory
import uk.gov.hmcts.feesregister.scenarios.GetAppropriateFeesAmountForGivenClaim
import uk.gov.hmcts.feesregister.scenarios.GetAppropriateFlatFeesForGivenFeeId
import uk.gov.hmcts.feesregister.scenarios.GetAllRangeGroups
import uk.gov.hmcts.feesregister.scenarios.GetCMCPaperUnspecified
import uk.gov.hmcts.feesregister.scenarios.GetOneRangeGroup
import uk.gov.hmcts.feesregister.scenarios.GetOneRangeGroupCalculations
import uk.gov.hmcts.feesregister.scenarios._
import uk.gov.hmcts.feesregister.util.{DevEnvironment, Headers}

class FeesRegisterSimulation extends Simulation {

  val httpConf = http.baseURL(DevEnvironment.baseURL)
                      .headers(Headers.commonHeader)

  val feesRegisterScenarios = List(
    //PostAndGetUser.postAndGetUser.inject(atOnceUsers(1)),

    GetAllFeesRegister.getAllCategories.inject(
      atOnceUsers(1),
      //rampUsers(100) over(1 seconds),
      //constantUsersPerSec(1000) during(15 seconds)
      rampUsersPerSec(1) to 100 during(300 seconds) // 6
      //rampUsersPerSec(10) to 20 during(10 minutes) randomized, // 7
      //splitUsers(1000) into(rampUsers(10) over(10 seconds)) separatedBy(10 seconds), // 8
      //splitUsers(1000) into(rampUsers(10) over(10 seconds)) separatedBy atOnceUsers(30), // 9
      //heavisideUsers(1000) over(20 seconds) // 10
    ),

      GetFeesRegisterByCategoryId.getFeesRegisterByCategoriesId.inject(
        atOnceUsers(1),
        rampUsersPerSec(1) to 100 during(300 seconds)
      ),
        GetAllFeesRegisterCategories.getAllFeesRegisterCategories.inject(
          atOnceUsers(1),
          rampUsersPerSec(1) to 100 during(300 seconds)
        ),
          GetAllFlatFeesForGivenCategory.getAllFlatFeesForGivenCategory.inject(
            atOnceUsers(1),
            rampUsersPerSec(1) to 100 during(300 seconds)
          ),
    GetAllRangeGroups.getAllCategories.inject(
      atOnceUsers(1),
      rampUsersPerSec(1) to 100 during(300 seconds)
    ),
    GetCMCPaperUnspecified.getAllCategories.inject(
      atOnceUsers(1),
      rampUsersPerSec(1) to 100 during(300 seconds)
    ),
    GetOneRangeGroup.getAllCategories.inject(
      atOnceUsers(1),
      rampUsersPerSec(1) to 100 during(300 seconds)
    ),
    GetOneRangeGroupCalculations.getAllCategories.inject(
      atOnceUsers(1),
      rampUsersPerSec(1) to 100 during(300 seconds)
    ),
    //GetAppropriateFlatFeesForGivenFeeId.getAppropriateFlatFeesForGivenFeeId.inject(
      //atOnceUsers(1),
      //rampUsersPerSec(1) to 100 during(300 seconds)

    //),
    GetAppropriateFeesAmountForGivenClaim.getAppropriateFeesAmountForGivenClaim.inject(
      atOnceUsers(1),rampUsersPerSec(1) to 100 during(300 seconds)
    ),
    GetAppropriateFlatFeesForGivenFeeId.getAppropriateFlatFeesForGivenFeeId.inject(atOnceUsers(DevEnvironment.users.toInt))
      .throttle(reachRps(600) in (20 seconds), holdFor(60 seconds))
  )

  setUp(feesRegisterScenarios)
    .protocols(httpConf)
    .maxDuration(1 minutes)
    .assertions(
      global.responseTime.max.lessThan(DevEnvironment.maxResponseTime.toInt)
    )
}