package com.example.SportScheduler.controller;
import com.example.SportScheduler.model.JwtUtil;
import com.example.SportScheduler.model.User;
import com.example.SportScheduler.repository.UserRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder encoder;

    public AuthenticationController(UserRepository userRepository, JwtUtil jwtUtil, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
        this.encoder = encoder;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){

        String encodedPassword=encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
         userRepository.save(user);
         return "User registered successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody User loginUser)
    {
        User user=userRepository.findByUsername(loginUser.getUsername()).orElseThrow(()->new UsernameNotFoundException("User not found"));

        if(!encoder.matches(loginUser.getPassword(),user.getPassword()))
        {
          System.out.println("Credentials are not matched");
        }
        return jwtUtil.generateToken(user.getUsername());
    }
}
