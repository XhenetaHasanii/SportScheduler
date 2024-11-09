package com.example.SportScheduler.service;
import com.example.SportScheduler.model.JwtUtil;
import com.example.SportScheduler.model.User;
import com.example.SportScheduler.repository.UserRepository;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AuthenticationService
{
    private final UserRepository userRepository;
    private final PasswordEncoder encoder;
    private  final JwtUtil jwtUtil;

    AuthenticationService(UserRepository userRepository,PasswordEncoder encoder, JwtUtil jwtUtil){
        this.userRepository=userRepository;
        this.encoder=encoder;
        this.jwtUtil=jwtUtil;
    }

    public String register(User user){
        if(userRepository.existsByEmail(user.getEmail())){
            throw new IllegalArgumentException("User with this email already exists");
        }
        String encodedPassword=encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        return "User registered successfully";
    }
    public String login(@RequestBody User loginUser) {
        User user = userRepository.findByUsername(loginUser.getUsername())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        if (!encoder.matches(loginUser.getPassword(), user.getPassword())) {
            System.out.println("Credentials are not matched");
            throw new BadCredentialsException("Invalid username or password");
        }

        // Generate and return the JWT token if the credentials are valid
        return jwtUtil.generateToken(user.getUsername());
    }


}
