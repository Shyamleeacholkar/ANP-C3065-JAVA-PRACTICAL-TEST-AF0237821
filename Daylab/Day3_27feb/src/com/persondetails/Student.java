package com.persondetails;
//class extend value from parent class
public class Student extends Person {
	//variable
    private String grade;
    //parameterized constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    //study method
    public void study() {
        System.out.println("I am Studying in  " + grade);
    }
}
