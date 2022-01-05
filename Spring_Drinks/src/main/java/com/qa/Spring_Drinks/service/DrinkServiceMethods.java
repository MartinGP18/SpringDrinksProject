package com.qa.Spring_Drinks.service;

import java.util.List;

public interface DrinkServiceMethods<T> {
	
	//CRRUD
	T create(T t);
	
	List<T> getAll();
	
	T getById(long id);
	
	T update(long id, T t);
	
	boolean delete(long id);

}
