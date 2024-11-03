package com.example.SportScheduler.service;
import com.example.SportScheduler.model.User;
import com.example.SportScheduler.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;
    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder){
        this.userRepository=userRepository;
        this.passwordEncoder=passwordEncoder;
    }

    public User register(User user) {
     // Encrypt the password before saving it in the database
     String encodedPassword=passwordEncoder.encode(user.getPassword());
     user.setPassword(encodedPassword);
     return userRepository.save(user);
    }
    public List<User> getUsers(){
       return (List<User>) userRepository.findAll();
     }
}




