package com.fitnessTracker.fitnessTracker.controller;
import com.fitnessTracker.fitnessTracker.DTO.AddAppUserRequest;
import com.fitnessTracker.fitnessTracker.entities.AppUser;
import com.fitnessTracker.fitnessTracker.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AppUserController {

    private final AppUserService appUserService;

    @PostMapping("/addUsers")
    public ResponseEntity<?> saveAppUser(@RequestBody AddAppUserRequest addAppUserRequest) {
        AppUser newUser = new AppUser(
                addAppUserRequest.getFirstname(),
                addAppUserRequest.getLastname(),
                addAppUserRequest.getEmail(),
                addAppUserRequest.getPassword());

        AppUser savedAppUser = appUserService.saveAppUser(newUser);
        return ResponseEntity.ok(savedAppUser);
    }
}
