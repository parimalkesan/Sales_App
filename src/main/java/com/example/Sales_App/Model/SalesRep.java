package com.example.Sales_App.Model;

public class SalesRep {
    private int id;
    private String name;
    private String country;
    private String city;
    private int zipCode;
    private String gender;

    public SalesRep() {

    }

    public SalesRep(int id, String name, String country, String city, int zipCode, String gender) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
