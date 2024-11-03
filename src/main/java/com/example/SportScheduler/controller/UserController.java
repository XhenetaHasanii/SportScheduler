package com.example.SportScheduler.controller;
import com.example.SportScheduler.model.User;
import com.example.SportScheduler.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

   private final UserService userService;
   UserController(UserService userService){
       this.userService=userService;
   }
   @PostMapping("/register")
    public User register(@RequestBody User user){

      return userService.register(user);
   }

   @GetMapping
   public List<User> getUsers(){

        return userService.getUsers();
   }
}
