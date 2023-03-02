package com.vehicaldetails;
//class extend value from base class
public class Car extends Vehicle {
	//variable
	    private String color;
	    //parameterized constructor
	    public Car(String brand, String model, int year, String color) {
	        super(brand, model, year);
	        this.color = color;
	    }
	    //honk method
	    public void honk() {
	        System.out.println("Here ,Honking the " + color + " car");
	    }
}
