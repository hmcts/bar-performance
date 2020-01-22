package uk.gov.hmcts.paymentapp.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
//import uk.gov.hmcts.paymentapp.util.ServiceTokenGenerator
import scala.concurrent.duration._
object PostCreateCardPayment {

 //var token = ServiceTokenGenerator.generateToken();
 //print("Token...." + token)

  val bodyString = "{\"amount\": 420.99,\"description\": \"CMC Testing\",\"ccd_case_number\": \"prodtest\",\"case_reference\": \"3213qeqewq\"" +
   ", \"service\": \"CMC\", \"currency\": \"GBP\", \"site_id\": \"site123\"," +
   "\"fees\": [ {\"calculated_amount\": 100,\"code\": \"X0041\",\"version\": \"1\"}]}"

  val postUserHttp = http("post user")
    .post("/card-payments")
    .header("Authorization", "eyJ0eXAiOiJKV1QiLCJ6aXAiOiJOT05FIiwia2lkIjoiaEgvakJ0TGhVUFlhMlBSWmg0eFBIOWJOS1lZPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJiYXJwZXJmZG0yQG1haWxuZXNpYS5jb20iLCJhdXRoX2xldmVsIjowLCJhdWRpdFRyYWNraW5nSWQiOiI4ZmZiZWI4Ny00MDA0LTQzY2YtODE2Yy05NTdhNTY5MmY3ZWUiLCJpc3MiOiJodHRwczovL2Zvcmdlcm9jay1hbS5zZXJ2aWNlLmNvcmUtY29tcHV0ZS1pZGFtLXBlcmZ0ZXN0LmludGVybmFsOjg0NDMvb3BlbmFtL29hdXRoMi9obWN0cyIsInRva2VuTmFtZSI6ImFjY2Vzc190b2tlbiIsInRva2VuX3R5cGUiOiJCZWFyZXIiLCJhdXRoR3JhbnRJZCI6IjhmNDVjYjJmLTc1MGMtNDhlOC1iNjM5LWY3ZTAyMGNjZjU5ZiIsImF1ZCI6ImJhcl9mcm9udGVuZCIsIm5iZiI6MTU2OTkyNjkyNywiZ3JhbnRfdHlwZSI6ImF1dGhvcml6YXRpb25fY29kZSIsInNjb3BlIjpbIm9wZW5pZCIsInByb2ZpbGUiLCJyb2xlcyJdLCJhdXRoX3RpbWUiOjE1Njk5MjY5MjYwMDAsInJlYWxtIjoiL2htY3RzIiwiZXhwIjoxNTY5OTU1NzI3LCJpYXQiOjE1Njk5MjY5MjcsImV4cGlyZXNfaW4iOjI4ODAwLCJqdGkiOiJlMzdiYzBmYS0yNTQ0LTRiOTctOWE4ZS01YzI4MWQyY2I5YzcifQ.iQBzvXScGbW3DAp1FLUhf3oflPK3bLTeHtt1WWTHE8T6QcTQEhjUYqO1_ELhvJ4ssSQ5oUj-ebM41WpSPnqYEk9hQaeRP16ts3GMiJtSCl-ApshCT8AZpqrq4L12StFnw5jgLgC6A5nh4GOVU4ga1OEfa00b70gFJjnVcRqZGr--ucz4BsFsfa7KTssxiG32CxXKQKws1Xb9iXofLnCGQdzqKkRykANTWpVA8KvKfVltK1eOJVFXDxZM00ovaEZzhiqbas8G-7XKYbb0elEsPpGJd8Ccf9v2nUUcLYxgdyRkpjlVJO8y8RWCdW5K7dXXpeAnMj-ikVfoIB8S8zjaKA")
    .header("ServiceAuthorization", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkaXZvcmNlX2Zyb250ZW5kIiwiZXhwIjoxNTY5OTQzNjY3fQ.z8MySib7Tq5uEuxLJ5Eal-FlHm9QOxOdk8PvxG2FgaAcCqOoI_YCSrdxyzMd9ZKrUIiQjbXioV3G0T8C6lHRdA")
    .header("return-url", "https://localhost")
    .body(StringBody(bodyString))
    .header("Content-Type", "application/json")
    .check(status is 201)

  val postUser = scenario("post user").during(60 minutes) {
    exec(postUserHttp)
  }
}

