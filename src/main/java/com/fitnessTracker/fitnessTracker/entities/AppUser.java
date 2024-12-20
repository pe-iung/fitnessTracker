package com.fitnessTracker.fitnessTracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AppUser {
    @Id
    private UUID AppUserId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @OneToMany
    private Set<BodyWeightWithDate> bodyWeightRecords;

    public AppUser(
            String firstName,
            String lastName,
            String email,
            String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

    }
}
