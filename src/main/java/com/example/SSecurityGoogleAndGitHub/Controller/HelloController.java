package com.example.SSecurityGoogleAndGitHub.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{

    @GetMapping("/")
    public String greet()
    {
        return "Welcome to Poorna Spring Security";
    }
}
