/*package uk.gov.hmcts.paymentapp.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
//import uk.gov.hmcts.paymentapp.util.ServiceTokenGenerator
import scala.concurrent.duration._
object PostCreateCardPayment {

 //var token = ServiceTokenGenerator.generateToken();
 //print("Token...." + token)

  val bodyString = "{\"amount\": 420.99,\"description\": \"CMC Testing\",\"ccd_case_number\": \"312eqeqwe\",\"case_reference\": \"3213qeqewq\"" +
   ", \"service\": \"CMC\", \"currency\": \"GBP\", \"site_id\": \"site123\"," +
   "\"fees\": [ {\"calculated_amount\": 100,\"code\": \"X0041\",\"version\": \"1\"}]}"

  val postUserHttp = http("post user")
    .post("/card-payments")
    .header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJwMmtvbmRwcHJvbGx2ODNhcHEybnFpdmc5ZCIsInN1YiI6IjU0MSIsImlhdCI6MTUyMTU1NTcwMSwiZXhwIjoxNTIxNTg0NTAxLCJkYXRhIjoiY2l0aXplbixkZWZlbmRhbnQsY2xhaW1hbnQsY21jLXByaXZhdGUtYmV0YSxsZXR0ZXItaG9sZGVyLGxldHRlci1ob2xkZXIsbGV0dGVyLWhvbGRlcixsZXR0ZXItaG9sZGVyLGxldHRlci03MzIsbGV0dGVyLTE1ODQzLGxldHRlci0yMzQ0MixsZXR0ZXItNTM2MDYsbGV0dGVyLWhvbGRlcixsZXR0ZXItNTM2MTQsY2l0aXplbi1sb2ExLGRlZmVuZGFudC1sb2ExLGNsYWltYW50LWxvYTEsY21jLXByaXZhdGUtYmV0YS1sb2ExLGxldHRlci1ob2xkZXItbG9hMSxsZXR0ZXItaG9sZGVyLWxvYTEsbGV0dGVyLWhvbGRlci1sb2ExLGxldHRlci1ob2xkZXItbG9hMSxsZXR0ZXItNzMyLWxvYTEsbGV0dGVyLTE1ODQzLWxvYTEsbGV0dGVyLTIzNDQyLWxvYTEsbGV0dGVyLTUzNjA2LWxvYTEsbGV0dGVyLWhvbGRlci1sb2ExLGxldHRlci01MzYxNC1sb2ExIiwidHlwZSI6IkFDQ0VTUyIsImlkIjoiNTQxIiwiZm9yZW5hbWUiOiJQcmFnbmVzaCIsInN1cm5hbWUiOiJQYXRlbCIsImRlZmF1bHQtc2VydmljZSI6IkNNQyIsImxvYSI6MSwiZGVmYXVsdC11cmwiOiJodHRwczovL3d3dy10ZXN0Lm1vbmV5Y2xhaW0ucmVmb3JtLmhtY3RzLm5ldC9yZWNlaXZlciIsImdyb3VwIjoiY21jLXByaXZhdGUtYmV0YSJ9.B-CXNYUGEKAul-D8aop6FWhkvhvhPjDsdHo1b7cD3vM")
    .header("ServiceAuthorization", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjbWMiLCJleHAiOjE1MjE1NzAxNjZ9.rUB7R4YLU9kYnOFOE_yHW3O7uZcOqEn-ftjZCnISpcmurZz0OWSOlreW-_UiCWxb_FqE2q5cIS_0QCkdmXozpg")
    .header("return-url", "https://localhost")
    .body(StringBody(bodyString))
    .header("Content-Type", "application/json")
    .check(status is 201)

  val postUser = scenario("post user").during(5 minutes) {
    exec(postUserHttp)
  }
}*/
