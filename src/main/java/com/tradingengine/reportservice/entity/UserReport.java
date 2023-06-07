package com.tradingengine.reportservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserReport {
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;
    private UUID userId;
    private String username;
    private String role;
    private String email;
    private String command;
    private String timestamp;
}
