package com.bloodbank.BloodBankManagementSystem.controller;

import com.bloodbank.BloodBankManagementSystem.entity.Hospital;
import com.bloodbank.BloodBankManagementSystem.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/hospitals")
    public String getHospitals(Model model) {
        model.addAttribute("hospitals", hospitalService.getAllHospitals());
        return "hospitals";
    }

    @GetMapping("/addHospital")
    public String addHospital(Model model) {
        model.addAttribute("hospital", new Hospital());
        return "addHospital";
    }

    @PostMapping("/saveHospital")
    public String saveHospital(@ModelAttribute Hospital hospital) {
        hospitalService.saveHospital(hospital);
        return "redirect:/hospitals";
    }

    @GetMapping("/editHospital/{id}")
    public String editHospital(@PathVariable Long id, Model model) {
        Hospital hospital = hospitalService.getHospitalById(id);
        model.addAttribute("hospital", hospital);
        return "addHospital";
    }

    @GetMapping("/deleteHospital/{id}")
    public String deleteHospital(@PathVariable Long id) {
        hospitalService.deleteHospital(id);
        return "redirect:/hospitals";
    }
}