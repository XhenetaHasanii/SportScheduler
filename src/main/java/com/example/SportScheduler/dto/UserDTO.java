package com.example.SportScheduler.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
public class UserDTO {
    @NotBlank(message ="FirstName is required")
    private String firstName;
    @NotBlank(message ="LastName is required")
    private String lastName;
    @Email
    @NotBlank(message ="Email is required")
    private String email;
    @NotBlank(message="Password is required")
    private String password;

    public UserDTO(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password=password;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){this.firstName=firstName;}
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(){return  password;}

    public void setPassword(String password){this.password=password;}
}

