package com.org.sat.firmaSAT;

import java.util.Arrays;
import java.util.Collections;

//import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.common.OAuth2AccessToken;
//import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import feign.RequestInterceptor;

//@Configuration
public class FeingConfig {
	
	/*@Value("${efirma.sat.url}")
	String loginUrl;
	@Value("${efirma.sat.user}")
	String username;
	@Value("${efirma.sat.password}")
	String password;
	
	@Bean
	public RequestInterceptor requestTokenInterceptor() {
		return requestTemplate -> {
			if (SecurityContextHolder.getContext().getAuthentication() != null
                    && SecurityContextHolder.getContext().getAuthentication().getPrincipal() != null) {
                OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails)
                        SecurityContextHolder.getContext().getAuthentication().getDetails();

                requestTemplate.header("Authorization", details.getTokenValue());
            } else {
				HttpHeaders headers = new HttpHeaders();
				headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
				headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
				headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));
				MultiValueMap<String, String> map = new LinkedMultiValueMap();
				map.add("username", username);
				map.add("password", password);
				HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
				try {
					RestTemplate simpleRestTemplate = new RestTemplateBuilder().build();
					OAuth2AccessToken auth = simpleRestTemplate.postForObject(
							loginUrl,
							request,
							OAuth2AccessToken.class
					);
					requestTemplate.header("Authorization", auth.getValue());
				}catch (Exception e){
					e.printStackTrace();
				}
            }
        };
	}*/
}
