package com.example.springdevansh;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
//import java.util.logging.Logger;

@Aspect
@Configuration
public class BeforeAspect {
    //private Class<com.example.springdevansh.BeforeAspect> BeforeAspect;
    private Logger LOGGER = LoggerFactory.getLogger(BeforeAspect.class);

    @Before("execution(* com.example.springdevansh.*.*(..))")
    public void before(JoinPoint joinpoint)
    {
        System.out.println("This is Before..");

        LOGGER.info("Intercepted methods call.. {}", joinpoint);
    }



}
