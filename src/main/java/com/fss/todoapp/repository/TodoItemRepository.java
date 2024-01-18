package com.fss.todoapp.repository;

import com.fss.todoapp.model.TodoItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TodoItemRepository
{
    private final List<TodoItem> todoItems = List.of(
           new TodoItem(1, "Learn Java", false),
            new TodoItem(2, "Learn Spring", false)
    );

    public List<TodoItem> findAll() {
        return todoItems;
    }


}
