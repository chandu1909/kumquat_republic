package com.galvanize.assessment.Kumquat.Republic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;


@Entity
public class Products {


    private String category;
    private double price;
    private String color;
    private String brand;

    @Id
    private Long id;


    public Products() {

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Products(String category, double price, String color, String brand, Long id) {
        this.category = category;
        this.price = price;
        this.color = color;
        this.brand = brand;
        this.id = id;
    }
}
