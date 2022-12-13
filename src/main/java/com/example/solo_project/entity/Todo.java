package com.example.solo_project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer todoId;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer todo_order;

    @Column(name = "COMPLETED", nullable = false)
    private boolean completed = false;
}
