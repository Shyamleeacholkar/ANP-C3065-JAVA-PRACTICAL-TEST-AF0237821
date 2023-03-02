package com.persondetails;
//class
public class Person {
//variable
	    private String name;
	    private int age;
	    //parameterized constructor
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    //speak method
	    public void speak() {
	        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
	    }
	}

	

