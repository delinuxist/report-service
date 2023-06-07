package com.tradingengine.reportservice.controller;

import com.tradingengine.reportservice.entity.UserReport;
import com.tradingengine.reportservice.service.UserReportService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/report")
@RequiredArgsConstructor
public class ReportController {

    private final UserReportService userReportService;

    @GetMapping("/users")
    public ResponseEntity<List<UserReport>> getAllUsers() {
        return ResponseEntity.ok(userReportService.getAllUsers("USER"));
    }

    @GetMapping("/admins")
    public ResponseEntity<List<UserReport>> getAllAdmins() {
        return ResponseEntity.ok(userReportService.getAllUsers("ADMIN"));
    }
}
