package com.example.Sales_App.Model;

public class SalesRepPerformance {
    private String salesRepName;
    private int sales;

    public String getSalesRepName() {
        return salesRepName;
    }

    public void setSalesRepName(String salesRepName) {
        this.salesRepName = salesRepName;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public SalesRepPerformance(){
    }

    public SalesRepPerformance(String repName,int sales) {
        this.salesRepName = repName;
        this.sales = sales;
    }



}
