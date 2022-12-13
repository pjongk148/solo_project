package com.example.solo_project.controller;

import com.example.solo_project.dto.TodoPatchDto;
import com.example.solo_project.dto.TodoPostDto;
import com.example.solo_project.entity.Todo;
import com.example.solo_project.mapper.TodoMapper;
import com.example.solo_project.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TodoController {
    private final TodoService todoService;
    private final TodoMapper mapper;

    public TodoController(TodoService todoService, TodoMapper mapper) {
        this.todoService = todoService;
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity postToDo(@RequestBody TodoPostDto todoPostDto) {
        Todo todo = todoService.createTodo(mapper.todoPostDtoToTodo(todoPostDto));

        return null;
    }

    @PatchMapping("{todo-id}")
    public ResponseEntity patchTodo(@PathVariable("todo-id") int todoId,
            @RequestBody TodoPatchDto toDoPatchDto) {
        return null;
    }

    @GetMapping("{todo-id}")
    public ResponseEntity getTodo(@PathVariable("todo-id") int todoId) {
        return null;
    }

    @GetMapping
    public ResponseEntity getTodos() {
        return null;
    }

    @DeleteMapping("{todo-id}")
    public ResponseEntity deleteTodo(@PathVariable("todo-id") int todoId) {
        return null;
    }

    @DeleteMapping
    public ResponseEntity deleteTodos() {
        return null;
    }
}
