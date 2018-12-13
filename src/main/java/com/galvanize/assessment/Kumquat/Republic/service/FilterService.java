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

    public  Products filterByBrand(String brand) {


        return products;
    }

    public Products filterByColor(String color) {

        return products;
    }

    public Products filterByPriceRange(double minprice, double maxprice) {

        return products;
    }
}
