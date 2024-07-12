package com.rocketseat.planner.activity;

import java.time.LocalDateTime;
import java.util.UUID;

public record ActivityDataDTO(UUID id,String title, LocalDateTime occurs_at ) {
    
}