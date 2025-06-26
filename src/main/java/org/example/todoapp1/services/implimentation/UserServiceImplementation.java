package org.example.todoapp1.services.implimentation;

import org.example.todoapp1.entities.User;
import org.example.todoapp1.repository.UserRepository;
import org.example.todoapp1.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {


    private final UserRepository userRepository;


    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User gcreateUser(User user) {
        return userRepository.save(user);
    }


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    @Override
    public Optional <User>getUserByID(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> getById(int id) {
        return userRepository.findById(id);
    }





    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }


}





