package com.fastcode.abcaq1.addons.reporting.domain.dashboard;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.time.*;

import com.fastcode.abcaq1.addons.reporting.application.dashboard.dto.DashboardDetailsOutput;

public interface IDashboardRepositoryCustom {
	
	Page<DashboardDetailsOutput> getAllDashboardsByUserId(Long userId, String search, Pageable pageable) ;

	Page<DashboardDetailsOutput> getAvailableDashboardsByUserId(Long userId,Long reportId, String search, Pageable pageable) ;

}

