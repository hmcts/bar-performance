/*package uk.gov.hmcts.paymentapp.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import uk.gov.hmcts.paymentapp.scenarios.PostCreateCardPayment.postUserHttp
//import uk.gov.hmcts.paymentapp.util.ServiceTokenGenerator

object PostCreditAccountPayment {

  // var token = ServiceTokenGenerator.generateToken();
  // print("Token...." + token)

  val bodyString = "{\"amount\": 420.99,\"description\": \"CMC Testing\",\"ccd_case_number\": \"312eqeqwe\",\"case_reference\": \"3213qeqewq\"" +
    ", \"service\": \"CMC\", \"currency\": \"GBP\",\"customer_reference\": \"xxx-xxx-xxx\", \"organisation_name\": \"HMCTS\", \"account_number\": \"PBA12345\", \"site_id\": \"site123\"," +
    "\"fees\": [ {\"calculated_amount\": 100,\"code\": \"X0041\",\"version\": \"1\"}]}"


  val postUserHttp = http("post user")
    .post("/credit-account-payments")
    .header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJkamxzNTFnMW52bXJhYWhrZnE2N2JobmR1NSIsInN1YiI6IjU0MSIsImlhdCI6MTUyMTExNDkzOCwiZXhwIjoxNTIxMTQzNzM4LCJkYXRhIjoiY2l0aXplbixkZWZlbmRhbnQsY2xhaW1hbnQsY21jLXByaXZhdGUtYmV0YSxsZXR0ZXItaG9sZGVyLGxldHRlci1ob2xkZXIsbGV0dGVyLWhvbGRlcixsZXR0ZXItaG9sZGVyLGxldHRlci03MzIsbGV0dGVyLTE1ODQzLGxldHRlci0yMzQ0MixsZXR0ZXItNTM2MDYsbGV0dGVyLWhvbGRlcixsZXR0ZXItNTM2MTQsY2l0aXplbi1sb2ExLGRlZmVuZGFudC1sb2ExLGNsYWltYW50LWxvYTEsY21jLXByaXZhdGUtYmV0YS1sb2ExLGxldHRlci1ob2xkZXItbG9hMSxsZXR0ZXItaG9sZGVyLWxvYTEsbGV0dGVyLWhvbGRlci1sb2ExLGxldHRlci1ob2xkZXItbG9hMSxsZXR0ZXItNzMyLWxvYTEsbGV0dGVyLTE1ODQzLWxvYTEsbGV0dGVyLTIzNDQyLWxvYTEsbGV0dGVyLTUzNjA2LWxvYTEsbGV0dGVyLWhvbGRlci1sb2ExLGxldHRlci01MzYxNC1sb2ExIiwidHlwZSI6IkFDQ0VTUyIsImlkIjoiNTQxIiwiZm9yZW5hbWUiOiJQcmFnbmVzaCIsInN1cm5hbWUiOiJQYXRlbCIsImRlZmF1bHQtc2VydmljZSI6IkNNQyIsImxvYSI6MSwiZGVmYXVsdC11cmwiOiJodHRwczovL3d3dy10ZXN0Lm1vbmV5Y2xhaW0ucmVmb3JtLmhtY3RzLm5ldC9yZWNlaXZlciIsImdyb3VwIjoiY21jLXByaXZhdGUtYmV0YSJ9.A4iMKbOTehODRL9zYQaO76VBveBhXwmUBx7yJf6ZHjY")
    .header("ServiceAuthorization", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjbWMiLCJleHAiOjE1MjExMjk0NzB9.aAA8rAA9Kil5TkNdSMNyutSo809UerC2QSQcz6yV5WXitNDyS1nGf6o7UkMQBLydk4flJoAPmk250dfW7js1RQ")
    .body(StringBody(bodyString))
    .header("Content-Type", "application/json")
    .check(status is 201)

  val postUser = scenario("post user").during(30 minutes) {
    exec(postUserHttp)
  }
}*/
