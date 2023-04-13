package com.example.databases.databases;

import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

@Configuration
public class MySecurityFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        System.out.println("Before any type of chaining");
        chain.doFilter(request,response);
        System.out.println("after any type of chaining");
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
