package ru.spring.kataaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import ru.spring.kata.common.configuration.SwaggerConfiguration;

@EnableAsync
@SpringBootApplication
@Import(SwaggerConfiguration.class)
public class KataAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(KataAccountApplication.class, args);
    }
}
