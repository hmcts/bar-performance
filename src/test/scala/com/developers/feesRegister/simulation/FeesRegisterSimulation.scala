package com.developers.feesRegister.simulation

import com.developers.feesRegister.util.DevEnvironment
import com.developers.feesRegister.util.Headers
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import com.developers.feesRegister.scenarios.GetAllFeesRegister
import com.developers.feesRegister.scenarios.GetFeesRegisterByCategoryId
import com.developers.feesRegister.scenarios.GetAllFeesRegisterCategories
import com.developers.feesRegister.scenarios.GetAllFlatFeesForGivenCategory
import com.developers.feesRegister.scenarios.GetAppropriateFeesAmountForGivenClaim
import com.developers.feesRegister.scenarios.GetAppropriateFlatFeesForGivenFeeId

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