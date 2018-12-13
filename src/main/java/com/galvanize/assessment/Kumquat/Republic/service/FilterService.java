package com.galvanize.assessment.Kumquat.Republic.service;

import com.galvanize.assessment.Kumquat.Republic.model.Products;

import com.galvanize.assessment.Kumquat.Republic.repo.Repository;
import org.springframework.stereotype.Service;


/*
* NOT WRITING ACTUAL BUSINESS LOGIC TO FILTER THE DATA YET
* */

@Service
public class FilterService {

    private Products products;

    private final Repository repository;

    public FilterService(Repository repository) {
        this.repository = repository;
    }

    public  Iterable<Products> filterByBrand(String brand) {


        return (Iterable<Products>) repository; //not yet created enums for the brand
    }

    public Products filterByColor(String color) {

        return products;
    }

    public Iterable<Products>filterByPriceRange(double minprice, double maxprice) {

        return null;
    }
}
