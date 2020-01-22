package uk.gov.hmcts.paymentapp.util

import java.util

object DevEnvironment {
  val baseURL = scala.util.Properties.envOrElse("baseURL", "https://payment-api-perftest.service.core-compute-perftest.internal")
 // val users = scala.util.Properties.envOrElse("numberOfUsers", "1000")
  //val maxResponseTime = scala.util.Properties.envOrElse("maxResponseTime", "6000") // in milliseconds
 // val DevAIDAMS2S = scala.util.Properties.envOrElse("IDAMS2S", "http://localhost:8002")

}
