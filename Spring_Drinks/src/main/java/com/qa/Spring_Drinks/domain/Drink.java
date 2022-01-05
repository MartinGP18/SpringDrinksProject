package com.qa.Spring_Drinks.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Drink {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Give the drink a name.")
	private String name;
	
	@NotNull(message = "Is the drink alcoholic?")
	private boolean isAlcoholic;
	
	@Column
	private float price;
	
	//Default constructor:
	public Drink() {
		
	}

	//Testing constructor with ID
	public Drink(long id, String name, boolean isAlcoholic, float price) {
		super();
		this.id = id;
		this.name = name;
		this.isAlcoholic = isAlcoholic;
		this.price = price;
	}

	//Creating constructor
	public Drink(String name, boolean isAlcoholic, float price) {
		super();
		this.name = name;
		this.isAlcoholic = isAlcoholic;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlcoholic() {
		return isAlcoholic;
	}

	public void setAlcoholic(boolean isAlcoholic) {
		this.isAlcoholic = isAlcoholic;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, isAlcoholic, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drink other = (Drink) obj;
		return id == other.id && isAlcoholic == other.isAlcoholic && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
	}

}
