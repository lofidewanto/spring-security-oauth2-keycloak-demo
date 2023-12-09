package com.programming.techie.authcode;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
    
    @GetMapping("/hello")
    public String hello(Authentication authentication) {
        return "hello " + getName(authentication) ;
    }

    private String getName(Authentication authentication) {
		return authentication.getName();
	}

}
