package com.qa.Spring_Drinks.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.Spring_Drinks.domain.Drink;

@Service
public class DrinkService implements DrinkServiceMethods<Drink> {

	@Override
	public Drink create(Drink t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Drink> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drink getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Drink update(long id, Drink t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
