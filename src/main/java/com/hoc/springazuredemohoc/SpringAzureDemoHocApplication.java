package com.hoc.springazuredemohoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoHocApplication {

    @GetMapping("/message")
    public String message() {
        return "Congrats! It is deployed in azure!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAzureDemoHocApplication.class, args);
    }

}
