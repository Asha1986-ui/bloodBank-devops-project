package com.bloodbank.BloodBankManagementSystem.controller;

import com.bloodbank.BloodBankManagementSystem.entity.BloodInventory;
import com.bloodbank.BloodBankManagementSystem.entity.BloodRequest;
import com.bloodbank.BloodBankManagementSystem.service.BloodInventoryService;
import com.bloodbank.BloodBankManagementSystem.service.BloodRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BloodRequestController {

    @Autowired
    private BloodRequestService bloodRequestService;

    @Autowired
    private BloodInventoryService bloodInventoryService;

    @GetMapping("/requests")
    public String getRequests(Model model) {
        model.addAttribute("requests", bloodRequestService.getAllRequests());
        return "requests";
    }

    @GetMapping("/addRequest")
    public String addRequest(Model model) {
        BloodRequest request = new BloodRequest();
        request.setStatus("PENDING");
        model.addAttribute("request", request);
        return "addRequest";
    }

    @PostMapping("/saveRequest")
    public String saveRequest(@ModelAttribute BloodRequest request) {

        if (request.getStatus() == null || request.getStatus().isEmpty()) {
            request.setStatus("PENDING");
        }

        bloodRequestService.saveRequest(request);

        return "redirect:/requests";
    }

    @GetMapping("/editRequest/{id}")
    public String editRequest(@PathVariable Long id, Model model) {

        BloodRequest request = bloodRequestService.getRequestById(id);

        model.addAttribute("request", request);

        return "addRequest";
    }

    @GetMapping("/deleteRequest/{id}")
    public String deleteRequest(@PathVariable Long id) {

        bloodRequestService.deleteRequest(id);

        return "redirect:/requests";
    }

    @GetMapping("/approveRequest/{id}")
    public String approveRequest(@PathVariable Long id) {

        BloodRequest request = bloodRequestService.getRequestById(id);

        if (request == null) {
            return "redirect:/requests";
        }

        BloodInventory inventory =
                bloodInventoryService.getByBloodGroup(request.getBloodGroup());

        if (inventory != null &&
                inventory.getUnits() >= request.getUnitsRequired()) {

            inventory.setUnits(
                    inventory.getUnits() - request.getUnitsRequired());

            bloodInventoryService.updateInventory(inventory);

            request.setStatus("APPROVED");

        } else {

            request.setStatus("REJECTED");

        }

        bloodRequestService.updateRequest(request);

        return "redirect:/requests";
    }

}