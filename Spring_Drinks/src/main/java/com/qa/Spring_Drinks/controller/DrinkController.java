package com.qa.Spring_Drinks.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.Spring_Drinks.domain.Drink;
import com.qa.Spring_Drinks.service.DrinkService;

@RestController
@RequestMapping("/drink")
public class DrinkController {
	
	private DrinkService service;
	
	private DrinkController(DrinkService service) {
		this.service = service;
		
	}
	
	@PostMapping("/create")
	public ResponseEntity<Drink> createDrink(@RequestBody Drink drink) {
		return new ResponseEntity<Drink>(this.service.create(drink), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/readAll")
	public ResponseEntity<List<Drink>> readAllDrinks() {
		return new ResponseEntity<List<Drink>>(this.service.getAll(), HttpStatus.FOUND);
	}
	
	@GetMapping("/readById/{id}")
	public ResponseEntity<Drink> readDrinkById(@PathVariable long id) {
		return new ResponseEntity<Drink>(this.service.getById(id), HttpStatus.FOUND);
	}
	
	@PutMapping("/updateDrinkById/{id}")
	public ResponseEntity<Drink> updateDrinkById(@PathVariable long id, @RequestBody Drink drink) {
		return new ResponseEntity<Drink>(this.service.update(id, drink), HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteDrink(@PathVariable long id) {
		return (this.service.delete(id)) ? new ResponseEntity<Boolean>(HttpStatus.NO_CONTENT) : new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND);
	}

}
