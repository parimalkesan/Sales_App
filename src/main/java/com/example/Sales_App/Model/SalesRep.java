package com.example.Sales_App.Model;

public class SalesRep {
    private int salesRepId;
    private String salesRepName;
    private String country;
    private String city;
    private int pinCode;
    private String gender;

    public SalesRep() {

    }

    public SalesRep(int id, String name, String country, String city, int zipCode, String gender) {
        this.salesRepId = id;
        this.salesRepName = name;
        this.country = country;
        this.city = city;
        this.pinCode = zipCode;
        this.gender = gender;
    }

    public int getSalesRepId() {
        return salesRepId;
    }

    public String getSalesRepName() {
        return salesRepName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getGender() {
        return gender;
    }

    public void setSalesRepId(int salesRepId) {
        this.salesRepId = salesRepId;
    }

    public void setSalesRepName(String salesRepName) {
        this.salesRepName = salesRepName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
