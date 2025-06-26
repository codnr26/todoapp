package org.example.todoapp1.controller;


import lombok.RequiredArgsConstructor;
import org.example.todoapp1.entities.User;
import org.example.todoapp1.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {


    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public User createUser(User user) {
        return userService.createUser(user);
    }


    // Get Users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    // Get User by ID
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable int id) {
        return userService.getById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable int id) {
        userService.getById(id).ifPresent(user -> {
            userService.deleteUserById(id);





        });
    }




}

