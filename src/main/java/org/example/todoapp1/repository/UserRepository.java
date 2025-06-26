package org.example.todoapp1.repository;

import org.example.todoapp1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}





