package com.example.Sales_App.Model;

public class DrugSales {
    private String name;
    private int sales;
    private String city;
    private String month;

    public DrugSales(){
    }

    public DrugSales(String name, int sales, String city, String month) {
        this.name = name;
        this.sales = sales;
        this.city = city;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
