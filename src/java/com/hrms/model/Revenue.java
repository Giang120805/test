package com.hrms.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Revenue implements Serializable {
    private static final long serialVersionUID = 1L;

    private String revenueId;
    private LocalDate date;
    private Double machineAmount;
    private Double salesAmount;
    private String notes;

    public Revenue(String revenueId, LocalDate date,
                   Double machineAmount, Double salesAmount, String notes) {
        this.revenueId = revenueId;
        this.date = date;
        this.machineAmount = machineAmount;
        this.salesAmount = salesAmount;
        this.notes = notes;
    }

    public String getRevenueId() {
        return revenueId;
    }

    public void setRevenueId(String revenueId) {
        this.revenueId = revenueId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate Date) {
        this.date = date;
    }

    public double getMachineAmount() {
        return machineAmount;
    }

    public void setMachineAmount(double machineAmount) {
        this.machineAmount = machineAmount;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}



