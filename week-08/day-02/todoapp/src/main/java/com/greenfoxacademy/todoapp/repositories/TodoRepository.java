package com.greenfoxacademy.todoapp.repositories;

import com.greenfoxacademy.todoapp.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository <Todo, Long>{
}
