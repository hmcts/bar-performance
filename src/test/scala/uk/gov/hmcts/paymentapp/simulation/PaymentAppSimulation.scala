package uk.gov.hmcts.paymentapp.simulation

import uk.gov.hmcts.paymentapp.util.DevEnvironment
import uk.gov.hmcts.paymentapp.util.Headers
import io.gatling.core.Predef.{rampUsersPerSec, _}
import io.gatling.http.Predef._

import scala.concurrent.duration._
import uk.gov.hmcts.paymentapp.scenarios.PostAllBarType
//import uk.gov.hmcts.paymentapp.scenarios.GetCreateCardPayment
//import uk.gov.hmcts.paymentapp.scenarios.GetCreditAccountPayment
//import uk.gov.hmcts.paymentapp.scenarios.PostCreateCardPayment
//import uk.gov.hmcts.paymentapp.scenarios.PostCreditAccountPayment
import uk.gov.hmcts.paymentapp.util.{DevEnvironment, Headers}

class PaymentAppSimulation extends Simulation {

  val httpConf = http.proxy(Proxy("proxyout.reform.hmcts.net",8080))
      .baseURL(DevEnvironment.baseURL)
                      .headers(Headers.commonHeader)

  setUp(PostAllBarType.barUser.inject(
    splitUsers(5) into(rampUsers(3) over(2 minutes)) separatedBy(1 minutes)).protocols(httpConf)
  )}

//setUp(PostCreditAccountPayment.postUser.inject(
//splitUsers(100) into(rampUsers(50) over(6 minutes)) separatedBy(10 minutes)).protocols(httpConf)
//)

 /* val paymentAppScenarios = List(

    PostCreateCardPayment.postUser.inject(
    //  splitUsers(50) into atOnceUsers(10) separatedBy(5 minutes)
     // rampUsers(20) over(200 seconds),
     // constantUsersPerSec(10) during(200 seconds),
     //atOnceUsers(1),
     //rampUsers(20) over(200 seconds)
    // constantUsersPerSec(1000) during(10 minutes)
      // rampUsersPerSec(1) to 5 during(10 seconds),
      // rampUsersPerSec(6) to 10 during(10 seconds),
      // rampUsersPerSec(11) to 15 during(10 seconds)
      // 6
      //rampUsersPerSec(10) to 20 during(10 minutes) randomized, // 7
      splitUsers(1000) into(rampUsers(100) over(10 minutes)) separatedBy(10 minutes)).protocols(httpConf)// 8
     // splitUsers(500) into(rampUsers(50) over(30 minutes ) separatedBy atOnceUsers(20) // 9
      //heavisideUsers(1000) over(20 seconds) // 10
      //rampUsers(5) over(60 seconds)
       // rampUsersPerSec(1) to(10) during(1 minutes)
     //nothingFor(4 seconds),
    // atOnceUsers(500),
    //  rampUsers(500) over (200 seconds)
       // atOnce(100 users), nothingFor(10 seconds), constantRate(20 usersPerSec) during (2 minutes)
    //)

    // )
  ))


 // setUp(paymentAppScenarios.inject(rampUsersPerSec(1) to(10) during(1 minutes)).protocols(httpConf)
  setUp(paymentAppScenarios)
    .protocols(httpConf)
    .maxDuration(2 hours)
  //  .assertions(
    //  global.responseTime.max.lessThan(DevEnvironment.maxResponseTime.toInt)

}*/