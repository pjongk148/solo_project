package com.example.solo_project.dto;

import lombok.Getter;

@Getter
public class TodoResponseDto {
    private int todoId;
    private String title;
    private int todo_order;
    private boolean completed;

}
