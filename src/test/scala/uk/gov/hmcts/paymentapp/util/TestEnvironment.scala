package uk.gov.hmcts.paymentapp.util

import java.util

object TestEnvironment {

  val baseURL = scala.util.Properties.envOrElse("baseURL", "https://bar-api-demo.service.core-compute-demo.internal")
 // val users = scala.util.Properties.envOrElse("numberOfUsers", "1000")
 // val maxResponseTime = scala.util.Properties.envOrElse("maxResponseTime", "20000") // in milliseconds

}
