package com.cit.todo.services;

import com.cit.todo.modals.Todo;
import com.cit.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public Todo createTodo(String name, String description,boolean isChecked) {
        Todo todo = new Todo(name, description, isChecked);
        todo = todoRepository.save(todo);
        return todo;
    }
}
