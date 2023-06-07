package com.tradingengine.reportservice.repository;

import com.tradingengine.reportservice.entity.UserReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserReportRepository extends JpaRepository<UserReport, UUID> {

    List<UserReport> findAllByRole(String role);
}
