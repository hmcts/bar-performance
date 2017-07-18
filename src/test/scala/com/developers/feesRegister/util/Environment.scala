package com.developers.feesRegister.util

import java.util

object DevEnvironment {
  val baseURL = scala.util.Properties.envOrElse("baseURL", "https://dev-proxy.fees-register.reform.hmcts.net")
  val users = scala.util.Properties.envOrElse("numberOfUsers", "500")
  val maxResponseTime = scala.util.Properties.envOrElse("maxResponseTime", "20000") // in milliseconds

}
