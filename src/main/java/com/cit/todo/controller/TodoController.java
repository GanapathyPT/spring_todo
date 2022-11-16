package com.cit.todo.controller;

import com.cit.todo.dto.TodoItem;
import com.cit.todo.modals.Todo;
import com.cit.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    TodoService todoService;

    @PostMapping("/add")
    public TodoItem createTodo(@RequestBody TodoItem todoItem) {
        return todoService.createTodo(todoItem);
    }
}
