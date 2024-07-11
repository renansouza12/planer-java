package com.rocketseat.planner.activities;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocketseat.planner.trip.Trip;

@Service
public class ActivityService {  

    @Autowired
    private ActivityRepository repository;

    public ActivityResponse registerActivity(ActivityRequestDTO payload,Trip trip){
        Activity newActivity = new Activity(payload.title(),payload.occurs_at(),trip);

        this.repository.save(newActivity);

        return new ActivityResponse(newActivity.getId());
    }

    public List<ActivityDataDTO> getAllActivitiesFromId(UUID tripId){
       return this.repository.findByTripId(tripId).stream().map(a -> new ActivityDataDTO(a.getId(),a.getTitle(),a.getOccursAt())).toList();
    }
}
