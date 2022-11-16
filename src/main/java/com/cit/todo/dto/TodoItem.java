package com.cit.todo.dto;

public class TodoItem {
    public String name;
    public String description;
    public boolean isChecked;

    public TodoItem(String name, String description, boolean isChecked) {
        this.name = name;
        this.description = description;
        this.isChecked = isChecked;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", isChecked=" + isChecked +
                '}';
    }
}
