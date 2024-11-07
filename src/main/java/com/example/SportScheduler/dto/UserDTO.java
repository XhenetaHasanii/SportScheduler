package com.example.SportScheduler.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
public class UserDTO {

    @NotBlank(message ="Username is required")
    private String username;
    @Email
    @NotBlank(message ="Email is required")
    private String email;
    @NotBlank(message="Password is required")
    private String password;

    public UserDTO(String username, String email, String password) {
        this.username=username;
        this.email = email;
        this.password=password;
    }
    public  String getUsername(){ return username;}
    public void setUsername(){this.username=username;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(){return  password;}

    public void setPassword(String password){this.password=password;}
}

