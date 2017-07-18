package com.developers.feesRegister.util

import java.util

object TestEnvironment {

  val baseURL = scala.util.Properties.envOrElse("baseURL", "https://test-proxy.fees-register.reform.hmcts.net")
  val users = scala.util.Properties.envOrElse("numberOfUsers", "500")
  val maxResponseTime = scala.util.Properties.envOrElse("maxResponseTime", "20000") // in milliseconds

}
