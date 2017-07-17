package com.developers.feesRegister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetAllFeesRegister {

  val getFeesRegisterHttp = http("get all Categories")
                        .get("/fees-register/")
                        .check(status is 200)

  val getAllCategories = scenario("Get All Categories")
                .exec(getFeesRegisterHttp)
}
