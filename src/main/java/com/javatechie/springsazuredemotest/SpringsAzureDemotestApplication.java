package com.javatechie.springsazuredemotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringsAzureDemotestApplication {

    public String message{
        @GetMapping("/message")
        return "message";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringsAzureDemotestApplication.class, args);
    }

}