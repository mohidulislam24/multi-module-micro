package com.example.module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Module1Application {

    @GetMapping("/api1")
    public String furo(){
        return "module-1";
    }

    public static void main(String[] args) {
        SpringApplication.run(Module1Application.class, args);
    }

}
