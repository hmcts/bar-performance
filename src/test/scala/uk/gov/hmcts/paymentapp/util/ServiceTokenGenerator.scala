/*package uk.gov.hmcts.paymentapp.util

import java.util.Collections.singletonList

import org.apache.http.impl.client.HttpClients
import org.springframework.http.{HttpEntity, HttpHeaders, MediaType}
import org.springframework.util.{LinkedMultiValueMap, MultiValueMap}
import org.springframework.web.client.RestTemplate
import uk.gov.hmcts.auth.provider.service.token.{CachedServiceTokenGenerator, HttpComponentsBasedServiceTokenGenerator, ServiceTokenGenerator}
import uk.gov.hmcts.auth.totp.GoogleTotpAuthenticator

object ServiceTokenGenerator {

  def generateS2SToken(): ServiceTokenGenerator = {
    var serviceToken = new CachedServiceTokenGenerator(new HttpComponentsBasedServiceTokenGenerator(HttpClients.createDefault(), DevEnvironment.DevAIDAMS2S, "cmc", new GoogleTotpAuthenticator(), "J7PBT37Y6C3SEFGX"), 3600)
    return serviceToken
  }

  def generateToken(): String = {
    val S2S_URL: String = DevEnvironment.DevAIDAMS2S
    val restTemplate = new RestTemplate

    val headers = new HttpHeaders
    headers.setContentType(MediaType.MULTIPART_FORM_DATA)
    headers.setAccept(singletonList(MediaType.ALL))

    val body = new LinkedMultiValueMap[String, String]
    body.add("microservice", "probate_frontend")
    var token = restTemplate.postForObject(S2S_URL + "/testing-support/lease", new HttpEntity[MultiValueMap[String, String]](body, headers), classOf[String])

    print(s"generated : $token")

    return token
  }

}*/
