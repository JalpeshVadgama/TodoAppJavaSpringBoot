package com.fss.todoapp.repository;

import com.fss.todoapp.model.TodoItem;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    public Optional<TodoItem> findById(int id) {
        return todoItems.stream()
                .filter(todoItem -> todoItem.id() == id)
                .findAny();
    }


}
