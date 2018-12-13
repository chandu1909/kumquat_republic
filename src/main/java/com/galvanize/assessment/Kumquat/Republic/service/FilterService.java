package com.galvanize.assessment.Kumquat.Republic.service;

import com.galvanize.assessment.Kumquat.Republic.model.Products;
import org.springframework.stereotype.Service;


/*
* NOT WRITING ACTUAL BUSINESS LOGIC TO FILTER THE DATA YET
* */

@Service
public class FilterService {

    private Products products;


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
