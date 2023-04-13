package com.example.springdevansh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppPro {

    @Value("${app.Name}")
    private String appName;

    @RequestMapping("/api")
    public String getName()
    {
        return appName;
    }

}
