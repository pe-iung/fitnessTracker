package com.fitnessTracker.fitnessTracker.service;
import com.fitnessTracker.fitnessTracker.entities.AppUser;
import com.fitnessTracker.fitnessTracker.repository.AppUserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService{

    private final AppUserRepository appUserRepository;

    /**
     * Save a new AppUser to the database.
     *
     * @param appUser the AppUser entity to save
     * @return the saved AppUser entity
     */
    @Override
    public AppUser saveAppUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

}
