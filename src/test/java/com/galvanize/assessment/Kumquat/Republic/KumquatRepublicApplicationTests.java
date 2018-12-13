package com.galvanize.assessment.Kumquat.Republic;

import com.galvanize.assessment.Kumquat.Republic.controller.FilterController;
import com.galvanize.assessment.Kumquat.Republic.model.Products;
import com.galvanize.assessment.Kumquat.Republic.service.FilterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KumquatRepublicApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Mock
	private FilterService mockService;

	//testing search results by brand
	//should take brand name or names as input and return the products tagged with same brand name
	@Test
	public void testBrandFilter(){

		//Setup
		Products expectedResult = new Products();
		String brand = "Armani";
		FilterController filterController = new FilterController(mockService);
		when(mockService.filterByBrand(brand)).thenReturn(expectedResult);

		//Execute

		Products actualResult = filterController.filterByBrand("Armani");

		//Assert
		assertEquals(expectedResult,actualResult); //haven't created entity yet to check the brand in the result set

		//Teardown
	}

	//testing search result by color
	public void testByColor(){

		//setup
		String color = "blue";
        Products expectedResult = new Products();
        FilterController filterController = new FilterController(mockService);
        when(mockService.filterByColor(color)).thenReturn(expectedResult);

        //Execute
        Products actualResult = filterController.filterByColor("blue");

        //Assert
        assertEquals(expectedResult,actualResult);


	}

	//testing search results by price range
	public void testFilterByPrice(){

	    double minPrice = 20.00;
	    double maxPrice = 70.00;

        Products expectedResult = new Products();
        FilterController filterController = new FilterController(mockService);
        when(mockService.filterByPriceRange(minPrice,maxPrice)).thenReturn(expectedResult);

        //execute
        Products actualResult = filterController.filterByPriceRange(minPrice,maxPrice);

        //Assert
        assertEquals(expectedResult,actualResult);


    }


	//testing combine multiple filter
	public void testCombineFilters(){

	}

	//testing order by price in ascending manner
	public void testOrderByPriceAscend(){

	}

	//testing order by price in descending order
	public  void testOrderByPriceDescend(){

	}



}

