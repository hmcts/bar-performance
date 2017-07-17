package com.developers.feesRegister.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._


object GetFeesRegisterByCategoryId {

  val getFeesRegisterByCategoriesIdHttp = http("get Fees-Register By Category Id")
    .get("/fees-register/categories/onlinefees")
    .check(status.is(200))

  val getFeesRegisterByCategoriesId = scenario("Get Fees-Register By Categories Id")
     .exec(
       getFeesRegisterByCategoriesIdHttp
     )
}
