package com.programming.techie.authcode;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
    
    @GetMapping("/hello")
    public String hello(Authentication authentication, 
        @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient) {
        String accessToken = authorizedClient.getAccessToken().getTokenValue();
        return "hello " + getName(authentication) + " - " + accessToken;
    }

    private String getName(Authentication authentication) {
		return authentication.getName();
	}

}
