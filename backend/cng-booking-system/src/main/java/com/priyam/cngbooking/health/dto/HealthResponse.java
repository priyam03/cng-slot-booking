package com.priyam.cngbooking.health.dto;

import java.time.LocalDateTime;

public record HealthResponse(
        String status,
        String application,
        LocalDateTime timestamp
) {
}