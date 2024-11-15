package com.example.SportScheduler.controller;
import com.example.SportScheduler.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
   private final UserService userService;
   UserController(UserService userService){
       this.userService=userService;
   }


}
