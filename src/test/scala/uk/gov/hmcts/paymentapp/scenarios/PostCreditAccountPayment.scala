package uk.gov.hmcts.paymentapp.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
//import uk.gov.hmcts.paymentapp.util.ServiceTokenGenerator

object PostCreditAccountPayment {


  val bodyString = "{\"amount\": 420.99,\"description\": \"CMC Testing\",\"ccd_case_number\": \"312eqeqwe\",\"case_reference\": \"3213qeqewq\"" +
   ", \"service_name\": \"CMC\", \"currency\": \"GBP\",\"customer_reference\":\"xxxx-xxxx-xxxx\",\"organisation_name\":\"hmcts\"," +
    " \"account_number\":\"PBA1234567\",\"site_id\": \"site123\"," +
   "\"fee\": [ {\"calculated_amount\": 100,\"code\": \"X0041\",\"version\": \"1\"}]}"


  val postUserHttp = http("post user")
    .post("/card-payments")
    .header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJmYWFidXYwNzMxbHAxcWppNzQ4bmkwaTBpcyIsInN1YiI6IjU0MSIsImlhdCI6MTUxODk0Njg2NCwiZXhwIjoxNTE4OTUwNDY0LCJkYXRhIjoiY2l0aXplbixkZWZlbmRhbnQsY2xhaW1hbnQsY21jLXByaXZhdGUtYmV0YSxsZXR0ZXItaG9sZGVyLGxldHRlci1ob2xkZXIsbGV0dGVyLWhvbGRlcixsZXR0ZXItaG9sZGVyLGxldHRlci03MzIsbGV0dGVyLTE1ODQzLGxldHRlci0yMzQ0MixsZXR0ZXItNTM2MDYsbGV0dGVyLWhvbGRlcixsZXR0ZXItNTM2MTQsY2l0aXplbi1sb2ExLGRlZmVuZGFudC1sb2ExLGNsYWltYW50LWxvYTEsY21jLXByaXZhdGUtYmV0YS1sb2ExLGxldHRlci1ob2xkZXItbG9hMSxsZXR0ZXItaG9sZGVyLWxvYTEsbGV0dGVyLWhvbGRlci1sb2ExLGxldHRlci1ob2xkZXItbG9hMSxsZXR0ZXItNzMyLWxvYTEsbGV0dGVyLTE1ODQzLWxvYTEsbGV0dGVyLTIzNDQyLWxvYTEsbGV0dGVyLTUzNjA2LWxvYTEsbGV0dGVyLWhvbGRlci1sb2ExLGxldHRlci01MzYxNC1sb2ExIiwidHlwZSI6IkFDQ0VTUyIsImlkIjoiNTQxIiwiZm9yZW5hbWUiOiJQcmFnbmVzaCIsInN1cm5hbWUiOiJQYXRlbCIsImRlZmF1bHQtc2VydmljZSI6IkNNQyIsImxvYSI6MSwiZGVmYXVsdC11cmwiOiJodHRwczovL3d3dy10ZXN0Lm1vbmV5Y2xhaW0ucmVmb3JtLmhtY3RzLm5ldC9yZWNlaXZlciIsImdyb3VwIjoiY21jLXByaXZhdGUtYmV0YSJ9.BEvshJF532elDtb35sgqgYV5m224sydBhgkSs59ffA0")
    .header("ServiceAuthorization", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjbWMiLCJleHAiOjE1MTg5NjEzODh9.1Z7z_WyB8zDTccH5Sb3NUTNAjNw6p29suwqcc2CNNCn92-p66gCoWrolVus-QmDau5xaJRjtar15wjmHKqX2jg")
    .header("user-id", "541")
    .header("return-url", "https://localhost")
    .body(StringBody(bodyString))
    .header("Content-Type", "application/json")
    .check(status is 201)

  val postUser = scenario("post user")
    .exec(postUserHttp)
}
