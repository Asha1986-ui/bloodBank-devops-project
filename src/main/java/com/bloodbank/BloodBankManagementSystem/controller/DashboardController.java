package com.bloodbank.BloodBankManagementSystem.controller;

import com.bloodbank.BloodBankManagementSystem.repository.DonorRepository;
import com.bloodbank.BloodBankManagementSystem.repository.PatientRepository;
import com.bloodbank.BloodBankManagementSystem.repository.BloodInventoryRepository;
import com.bloodbank.BloodBankManagementSystem.repository.BloodRequestRepository;
import com.bloodbank.BloodBankManagementSystem.repository.HospitalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @Autowired
    private DonorRepository donorRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private BloodInventoryRepository bloodInventoryRepository;

    @Autowired
    private BloodRequestRepository bloodRequestRepository;

    @Autowired
    private HospitalRepository hospitalRepository;

    @GetMapping("/")
    public String dashboard(Model model) {

        model.addAttribute("donorCount", donorRepository.count());
        model.addAttribute("patientCount", patientRepository.count());
        model.addAttribute("inventoryCount", bloodInventoryRepository.count());
        model.addAttribute("requestCount", bloodRequestRepository.count());
        model.addAttribute("hospitalCount", hospitalRepository.count());

        return "dashboard";
    }
}