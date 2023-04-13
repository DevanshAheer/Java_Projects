package com.example.databases.databases;

import jakarta.persistence.Embeddable;

@Embeddable
public class address {
    public long basicSalary;
    public long bonusSalary;
    public long taxAmount;
    public long specialAllowanceSalary;

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public long getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(long bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public long getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(long taxAmount) {
        this.taxAmount = taxAmount;
    }

    public long getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(long specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    public address() {
    }

    public address(long basicSalary, long bonusSalary, long taxAmount, long specialAllowanceSalary) {
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
        this.taxAmount = taxAmount;
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
