/*package uk.gov.hmcts.paymentapp.scenarios

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
    .header("Authorization", "eyJ0eXAiOiJKV1QiLCJ6aXAiOiJOT05FIiwia2lkIjoiRm8rQXAybThDT3ROb290ZjF4TWg0bGc3MFlBPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJCQVJQUkVQUk9EUE9TVENMRVJLQE1BSUxJTkFUT1IuQ09NIiwiYXV0aF9sZXZlbCI6MCwiYXVkaXRUcmFja2luZ0lkIjoiNDY4NzY0YzktODA5Yy00ZTJhLWJkODctYzgxMTFlMGFmOWMzIiwiaXNzIjoiaHR0cHM6Ly9mb3JnZXJvY2stYW0uc2VydmljZS5jb3JlLWNvbXB1dGUtaWRhbS1hYXQuaW50ZXJuYWw6ODQ0My9vcGVuYW0vb2F1dGgyL2htY3RzIiwidG9rZW5OYW1lIjoiYWNjZXNzX3Rva2VuIiwidG9rZW5fdHlwZSI6IkJlYXJlciIsImF1dGhHcmFudElkIjoiOWFiOTdhNmYtMDkyNS00NTY5LWEzYTctOWIwZjNhNTYxNjM3IiwiYXVkIjoiYmFyX2Zyb250ZW5kIiwibmJmIjoxNTYzMjc4ODgxLCJncmFudF90eXBlIjoiYXV0aG9yaXphdGlvbl9jb2RlIiwic2NvcGUiOlsiYWNyIiwib3BlbmlkIiwicHJvZmlsZSIsInJvbGVzIiwiYXV0aG9yaXRpZXMiXSwiYXV0aF90aW1lIjoxNTYzMjc4ODgxMDAwLCJyZWFsbSI6Ii9obWN0cyIsImV4cCI6MTU2MzMwNzY4MSwiaWF0IjoxNTYzMjc4ODgxLCJleHBpcmVzX2luIjoyODgwMCwianRpIjoiMzAzNWE2M2YtYTcxOC00MjE5LThlZTEtZWNjODFjNmU0MmMzIn0.smZDLZ3u6GycF6AW0mooMLpCEGEXOjmY71QnPU-oFnrbyrCprHXZfQ9HU2hwlORAYTTztncelT7VlZLTpZvfmqw4AUyKE5VqzLikf0mB2_uT7yUnWLPeKJi0eb-D00j18zcTdi0qU-djZgMA1w9U9uwjj02YFwsohSjOz-2NMdAhQp8HTH-Pm12RIlD2QvckDhFtCSIb6uvnTusn-Ln3r3zH2jJkvhO_Oil294tOaQy9tQrhAtDNo0JQUKt72YLJhAi-qZTkFOT1UThsmeeQdbgYE1lWv3oMko7MuaGCU_MSc5WqS6kApW6lpfxJgGT3-ns2GyKUjrADOheWe260Pg")
    .header("SiteId","Y431")
    .body(StringBody(bodyString))
    .header("Content-Type", "application/json")
    .check(status is 201)

  val barUser = scenario("bar user").during(1 minutes) {
    exec(postUserHttp)
  }
}
*/