package com.example.middleware;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MiddlewareService {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/middleware/hello")
    public String getHello() {
        String response = restTemplate.getForObject("http://localhost:8080/hello", String.class);
        return "Middleware says: " + response;
    }
}
