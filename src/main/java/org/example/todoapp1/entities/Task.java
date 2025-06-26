package org.example.todoapp1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.todoapp1.enums.PriorityLevel;

import java.time.LocalDate;







@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private LocalDate taskDate;
    private boolean completed;

    @Enumerated(EnumType.STRING)


    private PriorityLevel priorityLevel;




    @ManyToOne

    private User user;














}
