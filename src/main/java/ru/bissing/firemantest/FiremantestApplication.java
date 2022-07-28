package ru.bissing.firemantest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FiremantestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FiremantestApplication.class, args);
    }
}
