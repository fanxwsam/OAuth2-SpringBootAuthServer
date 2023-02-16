package com.login.ws.clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class OrderAppWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderAppWebClientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
//
//	@Bean
//	public WebClient webClient(ClientRegistrationRepository clientRegistrationRepository,
//							   OAuth2AuthorizedClientRepository oAuth2AuthorizedClientRepository){
//		ServletOAuth2AuthorizedClientExchangeFilterFunction oath2 =
//				new ServletOAuth2AuthorizedClientExchangeFilterFunction(clientRegistrationRepository, oAuth2AuthorizedClientRepository);
//		oath2.setDefaultOAuth2AuthorizedClient(true);
//		return WebClient.builder().apply(oath2.oauth2Configuration()).build();
//	}

}
