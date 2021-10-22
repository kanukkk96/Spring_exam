package com.example.spring_exam;

import com.demo.web.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication

@ComponentScan(basePackageClasses = {UserController.class})

public class SpringExamApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringExamApplication.class, args);
    }

}
