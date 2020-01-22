package uk.gov.hmcts.paymentapp.simulation

import uk.gov.hmcts.paymentapp.util.DevEnvironment
import uk.gov.hmcts.paymentapp.util.Headers
import io.gatling.core.Predef.{rampUsersPerSec, _}
import io.gatling.http.Predef._

import scala.concurrent.duration._
//import uk.gov.hmcts.paymentapp.scenarios.PostAllBarType
//import uk.gov.hmcts.paymentapp.scenarios.GetCreateCardPayment
//import uk.gov.hmcts.paymentapp.scenarios.GetCreditAccountPayment
import uk.gov.hmcts.paymentapp.scenarios.PostCreateCardPayment
import uk.gov.hmcts.paymentapp.scenarios.PostCreateCardPayment2
import uk.gov.hmcts.paymentapp.scenarios.PostCreateCardPayment3

//import uk.gov.hmcts.paymentapp.scenarios.PostCreditAccountPayment
import uk.gov.hmcts.paymentapp.util.{DevEnvironment, Headers}

class PaymentAppSimulation extends Simulation {

  val httpConf = http.proxy(Proxy("proxyout.reform.hmcts.net",8080))
      .baseURL(DevEnvironment.baseURL)
                      .headers(Headers.commonHeader)

  setUp(PostCreateCardPayment.postUser.inject(
 //splitUsers(100) into(rampUsers(50) over(10 minutes)) separatedBy(5 minutes)).protocols(httpConf))
 atOnceUsers(1)

   // rampUsers(100) over(1 seconds)
  ).protocols(httpConf))
  //reachRps(600) in (20 seconds)).protocols(httpConf))

}
