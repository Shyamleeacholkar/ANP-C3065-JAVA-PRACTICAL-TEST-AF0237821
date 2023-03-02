package com.vehicaldetails;
//class
public class Vehicle {
	//private variable
	    private String brand;
	    private String model;
	    private int year;
	    //parameterized constructor
	    public Vehicle(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }
	    //drive method
	    public void drive() {
	        System.out.println("Driving the " + year + " " + brand + " " + model);
	    }
	}

	
	

