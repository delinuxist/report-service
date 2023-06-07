package com.tradingengine.reportservice.service;

import com.tradingengine.reportservice.dto.UserReportDto;
import com.tradingengine.reportservice.entity.UserReport;

import java.util.List;

public interface UserReportService {
    void saveUserReport(UserReportDto userReportDto);

    List<UserReport> getAllUsers(String role);
}
