package com.qa.Spring_Drinks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.Spring_Drinks.domain.Drink;

public interface DrinkRepo extends JpaRepository<Drink, Long>{

}
