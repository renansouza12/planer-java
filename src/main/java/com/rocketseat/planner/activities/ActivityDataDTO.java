package com.rocketseat.planner.activities;

import java.time.LocalDateTime;
import java.util.UUID;

public record ActivityDataDTO(UUID id,String title, LocalDateTime occurs_at ) {
    
}
