package com.fitnessTracker.fitnessTracker.repository;

import com.fitnessTracker.fitnessTracker.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.UUID;


public interface AppUserRepository extends JpaRepository<AppUser, UUID> {
}
