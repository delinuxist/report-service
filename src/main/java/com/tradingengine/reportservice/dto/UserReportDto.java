package com.tradingengine.reportservice.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record UserReportDto (
        UUID userId,
        String username,
        String email,
        String command,
        String role,
        String timestamp
) {
}
