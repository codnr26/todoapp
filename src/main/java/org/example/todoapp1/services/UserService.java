package org.example.todoapp1.services;

import org.example.todoapp1.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);


    List<User> getAllUsers();


    Optional <User>getUserByID(int id);

    Optional<User> getById(int id);


    void deleteUserById(int id);


}



