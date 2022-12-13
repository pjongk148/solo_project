package com.example.solo_project.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
public class TodoPatchDto {
    private int todoId;
    private String title;
    private int todo_order;
    private boolean completed;

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }
}
