package uk.gov.hmcts.paymentapp.scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
//import uk.gov.hmcts.paymentapp.util.ServiceTokenGenerator
import scala.concurrent.duration._

object PostCreateCardPayment3 {

 //var token = ServiceTokenGenerator.generateToken();
 //print("Token...." + token)

  val bodyString = "{\"amount\": 420.99,\"description\": \"CMC Testing\",\"ccd_case_number\": \"prodtest\",\"case_reference\": \"3213qeqewq\"" +
   ", \"service\": \"CMC\", \"currency\": \"GBP\", \"site_id\": \"site123\"," +
   "\"fees\": [ {\"calculated_amount\": 100,\"code\": \"X0041\",\"version\": \"1\"}]}"

  val postUserHttp = http("post user")
    .post("/card-payments")
    .header("Authorization", "eyJ0eXAiOiJKV1QiLCJ6aXAiOiJOT05FIiwia2lkIjoiaEgvakJ0TGhVUFlhMlBSWmg0eFBIOWJOS1lZPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiJiYXJwZXJmZG0yQG1haWxuZXNpYS5jb20iLCJhdXRoX2xldmVsIjowLCJhdWRpdFRyYWNraW5nSWQiOiJmZDRmOWQ5Yy00Y2FjLTQ5OWQtYjA1OS1iN2Y3MTk3MDRlMzUiLCJpc3MiOiJodHRwczovL2Zvcmdlcm9jay1hbS5zZXJ2aWNlLmNvcmUtY29tcHV0ZS1pZGFtLXBlcmZ0ZXN0LmludGVybmFsOjg0NDMvb3BlbmFtL29hdXRoMi9obWN0cyIsInRva2VuTmFtZSI6ImFjY2Vzc190b2tlbiIsInRva2VuX3R5cGUiOiJCZWFyZXIiLCJhdXRoR3JhbnRJZCI6IjcxMWZlMTVkLTA4YTUtNDZjNS1iNDI5LWU1MjU3MzBmNTQyYiIsImF1ZCI6ImJhcl9mcm9udGVuZCIsIm5iZiI6MTU2OTc4ODUzOCwiZ3JhbnRfdHlwZSI6ImF1dGhvcml6YXRpb25fY29kZSIsInNjb3BlIjpbIm9wZW5pZCIsInByb2ZpbGUiLCJyb2xlcyJdLCJhdXRoX3RpbWUiOjE1Njk3ODg1MzgwMDAsInJlYWxtIjoiL2htY3RzIiwiZXhwIjoxNTY5ODE3MzM4LCJpYXQiOjE1Njk3ODg1MzgsImV4cGlyZXNfaW4iOjI4ODAwLCJqdGkiOiJhZWYyNjQ5Mi00ZDVlLTRiYjAtOGViMy1kOWFmYzJhOWUxNDgifQ.AkgDF-_-QWEhiNxtHA6w8rT_13zwJXA0tuc6STlAFwTwfAmjpzIKXejnac9BpxJwCPXzAh1LvPhZiYk98oZcXWvoCi3hgFn0OBdZo3BYqLEIHFdSDNBi2_mmTKwTA6yBHAfSP5YwbXI2VhZ6Kmz4Gi9Gvtr1CpfBHDKNvdrdTSQAsVm3p7vvq5KIhkt1SZWeqnoAe2a47_Cps8n5XP0gKmheSkXT2guZ9axZco2N03bw_Wefu0YTgYadkKl4OE5yo6uH4WwD1lj7dkR6zo28i_7yBp4TNq0WiXza56-6CFsm-AIIIQx5FY9zPKHXBv_hjZTJ4EB3TeeOueXCo33D6w")
    .header("ServiceAuthorization", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkaXZvcmNlX2Zyb250ZW5kIiwiZXhwIjoxNTY5ODAzMDU3fQ.iP7mEyYWL--yfUCeVsINt3ITCvegzecdrpMTYEfBTn3OXiXSpRNnxALn57xPIA0auVAxu2dpKBc-k7PXT4UT_A")
    .header("return-url", "https://localhost")
    .body(StringBody(bodyString))
    .header("Content-Type", "application/json")
    .check(status is 201)

  val postUser = scenario("post user").during(5 minutes) {
    exec(postUserHttp)
  }
}

