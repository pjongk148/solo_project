package com.example.solo_project.service;

import com.example.solo_project.entity.Todo;
import com.example.solo_project.exception.BusinessLogicException;
import com.example.solo_project.exception.ExceptionCode;
import com.example.solo_project.repository.TodoReposiotory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {
    private final TodoReposiotory todoReposiotory;

    public TodoService(TodoReposiotory todoReposiotory) {
        this.todoReposiotory = todoReposiotory;
    }

    public Todo createTodo(Todo todo) {
        return todoReposiotory.save(todo);
    }

    public Todo updateTodo(Todo todo) {
        Todo findTodo = findVerifiedTodo(todo.getTodoId());

        Optional.ofNullable(todo.getTitle())
                .ifPresent(title -> findTodo.setTitle(title));

        return todoReposiotory.save(findTodo);
    }

    public Todo findTodo(int todoId) {
        return findVerifiedTodo(todoId);
    }

    public Todo findTodos() {
       return null;
    }

    public void deleteTodo(int todoId) {
        Todo findTodo = findVerifiedTodo(todoId);
        todoReposiotory.delete(findTodo);
    }

    public void deleteTodos() {
        todoReposiotory.deleteAll();
    }

    public Todo findVerifiedTodo(int todoId) {
        Optional<Todo> optionalTodo =
        todoReposiotory.findById(todoId);
        Todo findTodo =
                optionalTodo.orElseThrow(() ->
                        new BusinessLogicException(ExceptionCode.MEMBER_NOT_FOUND));
        return findTodo;

    }
}
