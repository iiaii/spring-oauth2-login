package me.iiaii.springsecurityfacebooklogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.client.web.OAuth2AuthorizedClientRepository;
import org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServerOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

@SpringBootApplication
public class SpringSecurityFacebookLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityFacebookLoginApplication.class, args);
	}
//
//	@Bean
//	public OAuth2UserService<OAuth2UserRequest, OAuth2User> oauth2UserService(WebClient rest) {
//		DefaultOAuth2UserService delegate = new DefaultOAuth2UserService();
//		return request -> {
//			OAuth2User user = delegate.loadUser(request);
//			if (!"github".equals(request.getClientRegistration().getRegistrationId())) {
//				return user;
//			}
//
//			OAuth2AuthorizedClient client = new OAuth2AuthorizedClient
//					(request.getClientRegistration(), user.getName(), request.getAccessToken());
//			String url = user.getAttribute("organizations_url");
//			List<Map<String, Object>> orgs = rest
//					.get().uri(url)
//					.attributes(oauth2AuthorizedClient(client))
//					.retrieve()
//					.bodyToMono(List.class)
//					.block();
//
//			if (orgs.stream().anyMatch(org -> "spring-projects".equals(org.get("login")))) {
//				return user;
//			}
//
//			throw new OAuth2AuthenticationException(new OAuth2Error("invalid_token", "Not in Spring Team", ""));
//		};
//	}
//
//	@Bean
//	public WebClient rest(ClientRegistrationRepository clients, OAuth2AuthorizedClientRepository authz) {
//		ServletOAuth2AuthorizedClientExchangeFilterFunction oauth2 =
//				new ServletOAuth2AuthorizedClientExchangeFilterFunction(clients, authz);
//		return WebClient.builder()
//				.filter(oauth2).build();
//	}
}
