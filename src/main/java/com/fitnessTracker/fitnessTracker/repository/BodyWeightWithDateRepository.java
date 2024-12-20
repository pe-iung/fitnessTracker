package com.fitnessTracker.fitnessTracker.repository;

import com.fitnessTracker.fitnessTracker.entities.BodyWeightWithDate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BodyWeightWithDateRepository extends JpaRepository<BodyWeightWithDate, UUID> {
}
