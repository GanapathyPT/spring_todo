package com.cit.todo.controller;

import com.cit.todo.dto.TodoItem;
import com.cit.todo.dto.TodoItemEdit;
import com.cit.todo.modals.Todo;
import com.cit.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    TodoService todoService;

    @PostMapping("/add")
    public TodoItem createTodo(@RequestBody TodoItem todoItem) {
        return todoService.createTodo(todoItem);
    }

    @PutMapping("/edit")
    public String updateTodo(@RequestBody TodoItemEdit todoItemEdit) {
        return todoService.updateTodo(todoItemEdit);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTodo(@PathVariable int id) {
        return todoService.deleteTodo(id);
    }
}
