package TuneBridge.v0.controller;

import java.security.Principal;
import java.util.Map;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class Spring_intilizer {
    
    @GetMapping("/user_details")
    public Mono<Map(String,Object)> home(OAuth2AuthenticationToken token){
        return Mono.just(token.getPrincipal().getAttributes());
    }
}
