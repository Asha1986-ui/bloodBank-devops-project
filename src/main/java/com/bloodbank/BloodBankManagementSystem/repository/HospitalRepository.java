package com.bloodbank.BloodBankManagementSystem.repository;

import com.bloodbank.BloodBankManagementSystem.entity.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}