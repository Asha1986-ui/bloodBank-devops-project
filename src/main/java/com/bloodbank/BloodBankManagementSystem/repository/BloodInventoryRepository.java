package com.bloodbank.BloodBankManagementSystem.repository;

import com.bloodbank.BloodBankManagementSystem.entity.BloodInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BloodInventoryRepository extends JpaRepository<BloodInventory, Long> {

    Optional<BloodInventory> findByBloodGroup(String bloodGroup);

}