package com.example.SportScheduler.service;
import com.example.SportScheduler.model.User;
import com.example.SportScheduler.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService  {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public List<User> getUsers(){
       return (List<User>) userRepository.findAll();
     }



}




