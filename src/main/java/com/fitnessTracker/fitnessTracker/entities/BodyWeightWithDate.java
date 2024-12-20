package com.fitnessTracker.fitnessTracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class BodyWeightWithDate {
    @Id
    private long bodyWeightId;

    @ManyToOne
    private AppUser user;

    private double value;
    private Date createdAt;
}
