package com.example.SportScheduler.controller;
import com.example.SportScheduler.model.User;
import com.example.SportScheduler.service.AuthenticationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthenticationController {
  private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {

        this.authenticationService = authenticationService;
    }
    @PostMapping("/register")
    public String register(@RequestBody User user){
        return authenticationService.register(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody User loginUser){
        return authenticationService.login(loginUser);
    }


}
