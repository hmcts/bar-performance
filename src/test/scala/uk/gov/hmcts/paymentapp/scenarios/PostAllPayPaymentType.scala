package uk.gov.hmcts.paymentapp.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
//import uk.gov.hmcts.paymentapp.util.ServiceTokenGenerator
import scala.concurrent.duration._

object PostAllBarType {

 //var token = ServiceTokenGenerator.generateToken();
 //print("Token...." + token)

  val bodyString = "{\"payer_name\": \"Anish Viswa\",\"amount\": \"55000\",\"currency\": \"GBP\"" +
   ", \"status\": \"D\", \"cheque_number\": \"767879\"}"

  val postUserHttp = http("bar user")
    .post("/cheques")
    .header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJkbGVrazU4bDVkaW5raDhpYWp0cGw3MWd1YyIsInN1YiI6IjEyNTk2NSIsImlhdCI6MTU1MTA1MDExNiwiZXhwIjoxNTUxMDc4OTE2LCJkYXRhIjoiYmFyLWZlZS1jbGVyayxiYXIsYmFyLWZlZS1jbGVyay1sb2ExLGJhci1sb2ExIiwidHlwZSI6IkFDQ0VTUyIsImlkIjoiMTI1OTY1IiwiZm9yZW5hbWUiOiJmZWUiLCJzdXJuYW1lIjoiY2xlcmsiLCJkZWZhdWx0LXNlcnZpY2UiOiJCQVIiLCJsb2EiOjEsImRlZmF1bHQtdXJsIjoiaHR0cHM6Ly91aS5wcmVwcm9kLmJhci5yZWZvcm0uaG1jdHMubmV0IiwiZ3JvdXAiOiJiYXItY2xlcmsifQ.zWjBKmgHnBp6ILR--KB6lCiJzBGd5yt6bAiyU9M5TzY")
    .body(StringBody(bodyString))
    .header("Content-Type", "application/json")
    .check(status is 201)

  val barUser = scenario("bar user").during(1 minutes) {
    exec(postUserHttp)
  }
}
