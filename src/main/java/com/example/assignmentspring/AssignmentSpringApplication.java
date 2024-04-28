package com.example.assignmentspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AssignmentSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssignmentSpringApplication.class, args);
    }

}
