package com.example.interfaceprog;

public class Country {
    private double area;
    private String country;

    public Country(String country, double area) {
        this.country = country;
        this.area = area;
    }

    public Country() {

    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
