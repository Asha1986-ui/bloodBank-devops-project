package com.bloodbank.BloodBankManagementSystem.controller;

import com.bloodbank.BloodBankManagementSystem.entity.Donor;
import com.bloodbank.BloodBankManagementSystem.service.DonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DonorController {

    @Autowired
    private DonorService donorService;

    @GetMapping("/donors")
    public String getDonors(Model model) {
    model.addAttribute("donors", donorService.getAllDonors());
    return "donors";
}

    @GetMapping("/addDonor")
    public String addDonor(Model model) {
        model.addAttribute("donor", new Donor());
        return "addDonor";
    }

    @PostMapping("/saveDonor")
public String saveDonor(@ModelAttribute Donor donor) {

    System.out.println("Donor ID = " + donor.getDonorId());

    donorService.saveDonor(donor);

    return "redirect:/donors";
}
@GetMapping("/editDonor/{id}")
public String editDonor(@PathVariable Long id, Model model) {
    Donor donor = donorService.getDonorById(id);
    model.addAttribute("donor", donor);
    return "addDonor";
}

@GetMapping("/deleteDonor/{id}")
public String deleteDonor(@PathVariable Long id) {
    donorService.deleteDonor(id);
    return "redirect:/donors";
}
}