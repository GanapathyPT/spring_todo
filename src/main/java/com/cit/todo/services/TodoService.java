package com.cit.todo.services;

import com.cit.todo.dto.TodoItem;
import com.cit.todo.modals.Todo;
import com.cit.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public TodoItem createTodo(TodoItem todoItem) {
        Todo todo = new Todo(todoItem.name, todoItem.description, todoItem.isChecked);
        todoRepository.save(todo);
        return todoItem;
    }
}
