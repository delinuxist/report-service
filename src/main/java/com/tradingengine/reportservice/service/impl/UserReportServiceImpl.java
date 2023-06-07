package com.tradingengine.reportservice.service.impl;

import com.tradingengine.reportservice.dto.UserReportDto;
import com.tradingengine.reportservice.entity.UserReport;
import com.tradingengine.reportservice.repository.UserReportRepository;
import com.tradingengine.reportservice.service.UserReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserReportServiceImpl implements UserReportService {

    private final UserReportRepository userReportRepository;
    @Override
    public void saveUserReport(UserReportDto userReportDto) {
        UserReport userReport = UserReport.builder()
                .userId(userReportDto.userId())
                .role(userReportDto.role())
                .username(userReportDto.username())
                .email(userReportDto.email())
                .command(userReportDto.command())
                .timestamp(userReportDto.timestamp())
                .build();
        userReportRepository.save(userReport);
    }

    @Override
    public List<UserReport> getAllUsers(String role) {
        return userReportRepository.findAllByRole(role);
    }
}
