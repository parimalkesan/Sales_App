package com.example.Sales_App.Model;

public class SalesRepPerformance {
    private int id;
    private String repName;
    private String productName;
    private String month;
    private int sales;

    public SalesRepPerformance(){

    }

    public SalesRepPerformance(int id, String repName, String productName, String month, int sales) {
        this.id = id;
        this.repName = repName;
        this.productName = productName;
        this.month = month;
        this.sales = sales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRepName() {
        return repName;
    }

    public void setRepName(String repName) {
        this.repName = repName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}
