package com.galvanize.assessment.Kumquat.Republic.controller;

import com.galvanize.assessment.Kumquat.Republic.model.Products;
import com.galvanize.assessment.Kumquat.Republic.service.FilterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter")
public class FilterController {

    private final FilterService filterService;
    private final Logger slf4jLogger = LoggerFactory.getLogger(FilterController.class);


    public FilterController(FilterService filterService) {
        this.filterService = filterService;
    }

    @GetMapping("/brand/{brand}")
    public Products filterByBrand(@PathVariable String brand) {
        Products filteredProducts = null;
        try {
             filteredProducts = filterService.filterByBrand(brand);
        }catch (Exception e){

            slf4jLogger.error("Brandd not availble exveption raised....." +e);
        }

        return filteredProducts;
    }

    @GetMapping("/color/{color}")
    public Products filterByColor(@PathVariable String color){

        Products filteredProducts = null;

        try {

            filteredProducts = filterService.filterByColor(color);
        }catch (Exception e){
            slf4jLogger.error("Color not available exception raised....");
        }
        return filteredProducts;
    }

    @GetMapping("/pricerange/{minprice}/{maxprice}")
    public Products filterByPriceRange(@PathVariable double minprice, @PathVariable double maxprice){

        Products filteredProducts = null;

        try{
            filteredProducts = filterService.filterByPriceRange(minprice,maxprice);

        }catch (Exception e){
            slf4jLogger.error("no items found within the price... filtered data is null");
        }
        return filteredProducts;
    }


}
