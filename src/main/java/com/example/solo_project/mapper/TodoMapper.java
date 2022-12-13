package com.example.solo_project.mapper;

import com.example.solo_project.dto.TodoPatchDto;
import com.example.solo_project.dto.TodoPostDto;
import com.example.solo_project.dto.TodoResponseDto;
import com.example.solo_project.entity.Todo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    Todo todoPostDtoToTodo(TodoPostDto todoPostDto);
    Todo todoPatchDtoToTodo(TodoPatchDto todoPatchDto);
    TodoResponseDto TodoToTodoResponseDto(Todo todo);
    List<TodoResponseDto> todosToTodoResponseDtos(List<Todo> todos);
}
