package com.example.SportScheduler.service;
import com.example.SportScheduler.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService  {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }





}




