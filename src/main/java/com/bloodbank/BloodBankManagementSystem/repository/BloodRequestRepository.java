package com.bloodbank.BloodBankManagementSystem.repository;

import com.bloodbank.BloodBankManagementSystem.entity.BloodRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodRequestRepository extends JpaRepository<BloodRequest, Long> {
}