package com.javatechie.springsazuredemotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringsAzureDemoTestApplication {

    @GetMapping("/message")
    public String message(){
        return "message";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringsAzureDemoTestApplication.class, args);
    }

}
