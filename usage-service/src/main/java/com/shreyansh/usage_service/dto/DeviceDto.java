package com.shreyansh.usage_service.dto;

import lombok.Builder;

@Builder
public record DeviceDto (
        Long id,
        String name,
        String location,
        Long userId
) { }
