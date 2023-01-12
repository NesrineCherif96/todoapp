package com.todo.springboottodoapplication.repositories;

import com.todo.springboottodoapplication.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {  
}