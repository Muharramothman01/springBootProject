package com.example.assignmentspring.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
    //advice
    @Before("execution(void *createCustomer(com.example.assignmentspring.model.Customer))")
//    @Before("execution(public void org.example.assignmentspring.controllers.CustomerRestController2.create*(*))")//point cut
    public void logBeforeAtObjectToDB(){

        System.out.println("Before adding customer to DB !!");
    }
}
