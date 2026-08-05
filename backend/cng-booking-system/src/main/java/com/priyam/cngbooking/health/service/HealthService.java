package com.priyam.cngbooking.health.service;

import com.priyam.cngbooking.health.dto.HealthResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class HealthService {
    public HealthResponse getHealthStatus() {

        return new HealthResponse(
                "UP",
                "CNG Booking System",
                LocalDateTime.now()
        );

    }
}
