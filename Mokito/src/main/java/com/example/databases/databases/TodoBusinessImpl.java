package com.example.databases.databases;

import java.util.ArrayList;
import java.util.List;

//implementation file is SUT--> System under test where test were written on impl class methods.
public class TodoBusinessImpl {
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodoRelatedToString(String user)
    {
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodo(user);

        for(String todo:todos)
        {
            if(todo.contains("Spring"))
            {
                filteredTodos.add(todo);
            }
        }

        return filteredTodos;
    }
}
