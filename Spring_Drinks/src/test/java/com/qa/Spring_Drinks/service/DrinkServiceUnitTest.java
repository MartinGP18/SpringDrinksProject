package com.qa.Spring_Drinks.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.Spring_Drinks.domain.Drink;
import com.qa.Spring_Drinks.repo.DrinkRepo;

@SpringBootTest
public class DrinkServiceUnitTest {
	
	@Autowired
	private DrinkService service;
	
	@MockBean
	private DrinkRepo repo;
	
	@Test
	public void createTest() {
		Drink input = new Drink("coffee", false, (float) 2.25);
		Drink output = new Drink(1L, "coffee", false, (float) 2.25);
		
		Mockito.when(this.repo.save(input)).thenReturn(output);
		
		assertEquals(output, this.service.create(input));
		
		Mockito.verify(this.repo, Mockito.times(1)).save(input);
	}

}
