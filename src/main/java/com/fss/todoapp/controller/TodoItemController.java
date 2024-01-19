package com.fss.todoapp.controller;

import com.fss.todoapp.model.TodoItem;
import com.fss.todoapp.repository.TodoItemRepository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class TodoItemController {
    private final TodoItemRepository todoItemRepository;
    public TodoItemController(TodoItemRepository todoItemRepository){
        this.todoItemRepository = todoItemRepository;
    }

    public List<TodoItem> getAllTodoItems() {
        return todoItemRepository.findAll();
    }

    public TodoItem getTodoItemById(int id) {
        return todoItemRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("TodoItem not found with id " + id));
    }

}
