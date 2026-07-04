package com.bloodbank.BloodBankManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "blood_inventory")
public class BloodInventory {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "inventory_id")
   private Long id;

    @Column(nullable = false)
    private String bloodGroup;

    @Column(nullable = false)
    private Integer units;

    public BloodInventory() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }
}