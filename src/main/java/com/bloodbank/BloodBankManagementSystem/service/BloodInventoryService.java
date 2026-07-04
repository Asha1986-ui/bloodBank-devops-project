package com.bloodbank.BloodBankManagementSystem.service;

import com.bloodbank.BloodBankManagementSystem.entity.BloodInventory;
import com.bloodbank.BloodBankManagementSystem.repository.BloodInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodInventoryService {

    @Autowired
    private BloodInventoryRepository repository;

    public List<BloodInventory> getAll() {
        return repository.findAll();
    }

    public BloodInventory save(BloodInventory blood) {
        return repository.save(blood);
    }

    public BloodInventory getByBloodGroup(String bloodGroup) {
        return repository.findByBloodGroup(bloodGroup).orElse(null);
    }

    public void updateInventory(BloodInventory inventory) {
        repository.save(inventory);
    }
}