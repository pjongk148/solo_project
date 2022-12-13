package com.example.solo_project.repository;

import com.example.solo_project.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoReposiotory extends JpaRepository<Todo, Integer> {
}
