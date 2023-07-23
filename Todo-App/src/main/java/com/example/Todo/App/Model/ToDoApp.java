package com.example.Todo.App.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ToDoApp {
    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Long id;

    @Column
    private String todoname;

    @Column
    private Boolean isdoneStatus;
}
