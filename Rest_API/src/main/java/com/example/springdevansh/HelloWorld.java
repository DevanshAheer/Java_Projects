package com.example.springdevansh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(value = "/hello/path-variable/{name}")
    public HelloController HelloWorldPrint(@PathVariable String name)
    {
        return new HelloController(String.format("Hello World %s", name));
    }
}
