package com.rocketseat.planner.participant;

import java.util.UUID;

public record ParticipantDataDTO(UUID id,String name ,String email,Boolean isConfirmed) {
    
}
