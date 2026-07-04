package com.bloodbank.BloodBankManagementSystem.service;

import com.bloodbank.BloodBankManagementSystem.entity.BloodRequest;
import com.bloodbank.BloodBankManagementSystem.repository.BloodRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloodRequestService {

    @Autowired
    private BloodRequestRepository repository;

    public List<BloodRequest> getAllRequests() {
        return repository.findAll();
    }

    public BloodRequest saveRequest(BloodRequest request) {
        return repository.save(request);
    }

    public BloodRequest getRequestById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteRequest(Long id) {
        repository.deleteById(id);
    }

    public void updateRequest(BloodRequest request) {
        repository.save(request);
    }
}