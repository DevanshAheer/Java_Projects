package com.example.databases.databases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

    @Override
    public List<String> retrieveTodo(String user) {
        return Arrays.asList("Learn springmvc","learn hibernates","learn security oauth-2");
    }
}
