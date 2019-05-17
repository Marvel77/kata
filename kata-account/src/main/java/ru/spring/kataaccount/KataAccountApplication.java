package ru.spring.kataaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class KataAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(KataAccountApplication.class, args);
    }
}
