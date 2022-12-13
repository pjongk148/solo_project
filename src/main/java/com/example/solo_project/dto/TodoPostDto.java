package com.example.solo_project.dto;

import lombok.Getter;

@Getter
public class TodoPostDto {
    private String title;
    private int todo_order;
    private boolean completed;
}
