package com.details;

//create class student
public class Student {
	//declare variable
	 private String name;
	    private int rollNumber;
	    private Subject[] subjects;
	   //subject array for 2 subject
	    //parameterized constructor with all variable
	    public Student(String name, int rollNumber, Subject[] subjects) {
	        this.name = name;
	        this.rollNumber = rollNumber;
	        this.subjects = subjects;
	    }
	    //getter 
	    public String getName() {
	        return name;
	    }
	    
	    public int getRollNumber() {
	        return rollNumber;
	    }
	   
	    
	    public Subject[] getSubjects() {
	        return subjects;
	    }
	}


