package com.bloodbank.BloodBankManagementSystem.controller;

import com.bloodbank.BloodBankManagementSystem.entity.BloodInventory;
import com.bloodbank.BloodBankManagementSystem.service.BloodInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class BloodInventoryController {

    @Autowired
    private BloodInventoryService service;

    // Show inventory list
    @GetMapping("/inventory")
    public String viewInventory(Model model) {
        model.addAttribute("inventoryList", service.getAll());
        return "inventory";
    }

    // Show add form
    @GetMapping("/addInventory")
    public String addInventory(Model model) {
        model.addAttribute("inventory", new BloodInventory());
        return "addInventory";
    }

    // Save data
    @PostMapping("/saveInventory")
    public String saveInventory(@ModelAttribute BloodInventory inventory) {
        service.save(inventory);
        return "redirect:/inventory";
    }
}