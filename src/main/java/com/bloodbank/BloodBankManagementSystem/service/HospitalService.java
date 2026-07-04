package com.bloodbank.BloodBankManagementSystem.service;

import com.bloodbank.BloodBankManagementSystem.entity.Hospital;
import com.bloodbank.BloodBankManagementSystem.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    public Hospital getHospitalById(Long id) {
        return hospitalRepository.findById(id).orElse(null);
    }

    public void deleteHospital(Long id) {
        hospitalRepository.deleteById(id);
    }
}