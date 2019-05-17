package ru.spring.kata.tos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import ru.spring.kata.common.configuration.SwaggerConfiguration;

@SpringBootApplication
@Import(SwaggerConfiguration.class)
public class KataTosApplication {

    public static void main(String[] args) {
        SpringApplication.run(KataTosApplication.class, args);
    }
}
