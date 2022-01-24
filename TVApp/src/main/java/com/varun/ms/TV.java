package com.varun.ms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tv")
public class TV {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String brand;
	
	@Column
	private String model;
	
	@Column
	private int price;

	public int getId() {
		return id;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
