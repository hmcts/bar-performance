/*package uk.gov.hmcts.paymentapp.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
//import uk.gov.hmcts.paymentapp.util.ServiceTokenGenerator

object GetCreditAccountPayment {

  val getUserHttp = http("post user")
    .get("/credit-account-payments/RC-1518-9813-6213-7455")
    .header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJ2N2J0NjBkZWJ0dHE0MzR2azY3Nmc4dHMzNyIsInN1YiI6IjU0MSIsImlhdCI6MTUxOTEyNTc3NCwiZXhwIjoxNTE5MTI5Mzc0LCJkYXRhIjoiY2l0aXplbixkZWZlbmRhbnQsY2xhaW1hbnQsY21jLXByaXZhdGUtYmV0YSxsZXR0ZXItaG9sZGVyLGxldHRlci1ob2xkZXIsbGV0dGVyLWhvbGRlcixsZXR0ZXItaG9sZGVyLGxldHRlci03MzIsbGV0dGVyLTE1ODQzLGxldHRlci0yMzQ0MixsZXR0ZXItNTM2MDYsbGV0dGVyLWhvbGRlcixsZXR0ZXItNTM2MTQsY2l0aXplbi1sb2ExLGRlZmVuZGFudC1sb2ExLGNsYWltYW50LWxvYTEsY21jLXByaXZhdGUtYmV0YS1sb2ExLGxldHRlci1ob2xkZXItbG9hMSxsZXR0ZXItaG9sZGVyLWxvYTEsbGV0dGVyLWhvbGRlci1sb2ExLGxldHRlci1ob2xkZXItbG9hMSxsZXR0ZXItNzMyLWxvYTEsbGV0dGVyLTE1ODQzLWxvYTEsbGV0dGVyLTIzNDQyLWxvYTEsbGV0dGVyLTUzNjA2LWxvYTEsbGV0dGVyLWhvbGRlci1sb2ExLGxldHRlci01MzYxNC1sb2ExIiwidHlwZSI6IkFDQ0VTUyIsImlkIjoiNTQxIiwiZm9yZW5hbWUiOiJQcmFnbmVzaCIsInN1cm5hbWUiOiJQYXRlbCIsImRlZmF1bHQtc2VydmljZSI6IkNNQyIsImxvYSI6MSwiZGVmYXVsdC11cmwiOiJodHRwczovL3d3dy10ZXN0Lm1vbmV5Y2xhaW0ucmVmb3JtLmhtY3RzLm5ldC9yZWNlaXZlciIsImdyb3VwIjoiY21jLXByaXZhdGUtYmV0YSJ9.wYw--F2nvEG5vptWQ6_xfyx7Nz93_iktLZc_HRJ8WcU")
    .header("ServiceAuthorization", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjbWMiLCJleHAiOjE1MTkxNDAzMDh9.bf1r4kmj4ayISpq7ipOErH4jPrEMoHvNugxcA71W0zj5i6Hq1S5HI3EP7oI8Sl9L_ntahP0GWh6-veBRCPqbqA")
    .header("paymentReference","RC-1518-9813-6213-7455")
    .header("Content-Type", "application/json")
    .check(status is 201)

  val getUserForCreditAccount = scenario("post user")
    .exec(getUserHttp)
}
*/