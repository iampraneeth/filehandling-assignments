package com.capgemini.main;

import java.util.Objects;

public class Car implements Comparable<Car>{
	private String make;
	private String model;
	private int year;
	private double price;
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(make,model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Car) {
			return false;
		}
		
		Car other = (Car) obj;
		if (this.make==other.make && this.model==other.model) {
			return true;
		}
		
		return false;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	@Override
	public int compareTo(Car o) {
		
		return this.make.compareTo(o.make);
	}

}
