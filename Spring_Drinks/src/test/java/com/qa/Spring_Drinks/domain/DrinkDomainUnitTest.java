package com.qa.Spring_Drinks.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class DrinkDomainUnitTest {
	
	@Test
	public void testEquals() {
		EqualsVerifier.forClass(Drink.class).usingGetClass().verify();
	}
	
	@Test
	public void noIdConstructor() {
		Drink drink = new Drink("tea", false, (float) 1.50);
		
		assertNotNull(drink.getName());
		assertNotNull(drink.isAlcoholic());
		assertNotNull(drink.getPrice());
		
		assertEquals(drink.getName(), "tea");
		assertEquals(drink.isAlcoholic(), false);
		assertEquals(drink.getPrice(), 1.50);
	}
	
	@Test
	public void settersTest() {
		Drink drink = new Drink();
		
		drink.setName("milk");
		drink.setAlcoholic(false);
		drink.setPrice((float) 0.50);
		
		assertNotNull(drink.getName());
		assertNotNull(drink.isAlcoholic());
		assertNotNull(drink.getPrice());
		
		assertEquals(drink.getName(), "milk");
		assertEquals(drink.isAlcoholic(), false);
		assertEquals(drink.getPrice(), 0.50);
	}

}