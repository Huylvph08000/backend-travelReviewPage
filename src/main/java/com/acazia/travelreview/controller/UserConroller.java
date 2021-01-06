package com.acazia.travelreview.controller;

import com.acazia.travelreview.entity.User;
import com.acazia.travelreview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class UserConroller {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/users")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    // Create new account
    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
