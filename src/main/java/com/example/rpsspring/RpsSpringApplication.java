package com.example.rpsspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.example"})
@SpringBootApplication
public class RpsSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpsSpringApplication.class, args);
    }

}
