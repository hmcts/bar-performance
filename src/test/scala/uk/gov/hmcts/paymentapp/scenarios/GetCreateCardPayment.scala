/*package uk.gov.hmcts.paymentapp.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
//import uk.gov.hmcts.paymentapp.util.ServiceTokenGenerator

object GetCreateCardPayment {

  val getUserHttp = http("get user")
    .get("/card-payments/")
    .header("Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJ2NDFjNDNraWxqMWM4ZzQxamN0OGk2NWNjIiwic3ViIjoiNTQxIiwiaWF0IjoxNTIwOTQzMDE2LCJleHAiOjE1MjA5NzE4MTYsImRhdGEiOiJjaXRpemVuLGRlZmVuZGFudCxjbGFpbWFudCxjbWMtcHJpdmF0ZS1iZXRhLGxldHRlci1ob2xkZXIsbGV0dGVyLWhvbGRlcixsZXR0ZXItaG9sZGVyLGxldHRlci1ob2xkZXIsbGV0dGVyLTczMixsZXR0ZXItMTU4NDMsbGV0dGVyLTIzNDQyLGxldHRlci01MzYwNixsZXR0ZXItaG9sZGVyLGxldHRlci01MzYxNCxjaXRpemVuLWxvYTEsZGVmZW5kYW50LWxvYTEsY2xhaW1hbnQtbG9hMSxjbWMtcHJpdmF0ZS1iZXRhLWxvYTEsbGV0dGVyLWhvbGRlci1sb2ExLGxldHRlci1ob2xkZXItbG9hMSxsZXR0ZXItaG9sZGVyLWxvYTEsbGV0dGVyLWhvbGRlci1sb2ExLGxldHRlci03MzItbG9hMSxsZXR0ZXItMTU4NDMtbG9hMSxsZXR0ZXItMjM0NDItbG9hMSxsZXR0ZXItNTM2MDYtbG9hMSxsZXR0ZXItaG9sZGVyLWxvYTEsbGV0dGVyLTUzNjE0LWxvYTEiLCJ0eXBlIjoiQUNDRVNTIiwiaWQiOiI1NDEiLCJmb3JlbmFtZSI6IlByYWduZXNoIiwic3VybmFtZSI6IlBhdGVsIiwiZGVmYXVsdC1zZXJ2aWNlIjoiQ01DIiwibG9hIjoxLCJkZWZhdWx0LXVybCI6Imh0dHBzOi8vd3d3LXRlc3QubW9uZXljbGFpbS5yZWZvcm0uaG1jdHMubmV0L3JlY2VpdmVyIiwiZ3JvdXAiOiJjbWMtcHJpdmF0ZS1iZXRhIn0.9sJaaMsEsG7_6mhMjB1F8jdTLLC1YcyrTtDMj6LkgJU")
    .header("ServiceAuthorization", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJjbWMiLCJleHAiOjE1MjA5NTc1Mjh9.dPPCAMEREPgugLrRuYuoIjEicFkNr9ENa2IlVt1-0q1sNi6ZHgU-SbPqrQr-dqkMhSd4FVI2MxQ7skl2exjihA")
    .header("reference", "RC-1518-9796-1471-9215")
    .header("Content-Type", "application/json")
    .check(status is 201)

  val getUserforCreateCard = scenario("get user")
    .exec(getUserHttp)
}
*/