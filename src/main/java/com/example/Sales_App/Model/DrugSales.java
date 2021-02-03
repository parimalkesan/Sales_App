package com.example.Sales_App.Model;

public class DrugSales {
    private String drugName;
    private int drugSales;

    public DrugSales() {
    }

    public DrugSales(String name, int sales) {
        this.drugName = name;
        this.drugSales = sales;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getDrugSales() {
        return drugSales;
    }

    public void setDrugSales(int drugSales) {
        this.drugSales = drugSales;
    }
}

