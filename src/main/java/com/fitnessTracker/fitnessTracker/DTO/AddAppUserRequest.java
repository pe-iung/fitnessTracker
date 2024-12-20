package com.fitnessTracker.fitnessTracker.DTO;
import lombok.Value;

@Value
public class AddAppUserRequest {
    String firstname;
    String lastname;
    String email;
    String password;

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
}

