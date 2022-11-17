package com.cit.todo.services;

import com.cit.todo.dto.TodoItem;
import com.cit.todo.dto.TodoItemEdit;
import com.cit.todo.modals.Todo;
import com.cit.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public TodoItem createTodo(TodoItem todoItem) {
        Todo todo = new Todo(todoItem.name, todoItem.description, todoItem.isChecked);
        todoRepository.save(todo);
        return todoItem;
    }
    public
    public String updateTodo(TodoItemEdit todoItemEdit) {
        Optional<Todo> todo = todoRepository.findById(todoItemEdit.id);
        if(todo.isEmpty()) return "No Todo Found";

        Todo todoItem = todo.get();
        todoItem.setName(todoItemEdit.name);
        todoItem.setDescription(todoItemEdit.description);
        todoItem.setChecked(todoItemEdit.isChecked);

        todoRepository.save(todoItem);
        return "Updated Successfully";
    }

    public String deleteTodo(int id) {
        Optional<Todo> todo = todoRepository.findById(id);
        if(todo.isEmpty()) return "No Todo Found";

        Todo todoItem = todo.get();
        todoRepository.delete(todoItem);
        return "Todo deleted Successfully";
    }
}
