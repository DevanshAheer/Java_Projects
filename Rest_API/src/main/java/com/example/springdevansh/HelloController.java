package com.example.springdevansh;

public class HelloController {
    private String name;
    public HelloController(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloController{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
