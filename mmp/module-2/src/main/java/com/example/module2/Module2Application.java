package com.example.module2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Module2Application {

    @GetMapping("/api2")
    public String Ofuro(){
        return "module-2";
    }

    public static void main(String[] args) {
        SpringApplication.run(Module2Application.class, args);
    }

}
