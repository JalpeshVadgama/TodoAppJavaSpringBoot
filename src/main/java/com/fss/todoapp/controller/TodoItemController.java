package com.fss.todoapp.controller;

import com.fss.todoapp.model.TodoItem;
import com.fss.todoapp.repository.TodoItemRepository;

import java.util.List;

public class TodoItemController {
    private final TodoItemRepository todoItemRepository;
    public TodoItemController(TodoItemRepository todoItemRepository){
        this.todoItemRepository = todoItemRepository;
    }

    public List<TodoItem> getAllTodoItems(){
        return todoItemRepository.findAll();
    }
}
