package com.main;
import com.vehicaldetails.Car;
//main class
public class Main {
	  public static void main(String[] args) {
		  //object creation
	        Car myCar = new Car("SUZUKI", "MARUTI", 2022, "red");
	        //method calling
	        myCar.drive();
	        myCar.honk();
	    }
}
