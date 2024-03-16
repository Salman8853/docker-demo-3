package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemo3Application {

    public static void main(String[] args) {
        SpringApplication.run(DockerDemo3Application.class, args);
    }


@GetMapping("/welcome")
public String applicationHealth(){
    return "Welcome to docker with java techie ..!!";
}
}

