package dev.fedosov.authentication_basic.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(Authentication authentication) {
        return String.format("Поздравляю, %s! Вы прошли Basic аутентификацию", authentication.getName());
    }
}
