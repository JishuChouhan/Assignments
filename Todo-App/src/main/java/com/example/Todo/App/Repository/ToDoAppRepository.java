package com.example.Todo.App.Repository;

import com.example.Todo.App.Model.ToDoApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoAppRepository extends JpaRepository<ToDoApp, Long> {

}
