package com.example.lovable_clone.dto.subscription;

public record PlanLimitsResponse(
        String planName,
        Integer maxTokePerDay,
        Integer maxProjects,
        Boolean unlimitedAi
) {
}
