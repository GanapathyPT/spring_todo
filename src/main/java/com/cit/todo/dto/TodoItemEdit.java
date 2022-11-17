package com.cit.todo.dto;

public class TodoItemEdit {
    public int id;
    public String name;
    public String description;
    public boolean isChecked;

    public TodoItemEdit(int id, String name, String description, boolean isChecked) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isChecked = isChecked;
    }
}
