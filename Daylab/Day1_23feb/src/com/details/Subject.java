package com.details;
//subject class
public class Subject {
	 //variable declared
	private String Subject_name;
    private int Subject_marks;
   
    //parameterized constructor
    public Subject(String Subject_name, int Subject_marks) {
        this.Subject_name = Subject_name;
        
    }
    //getter and setter
    public String getName() {
        return Subject_name;
    }
    
    public void setMarks(int Subject_marks) {
        this.Subject_marks = Subject_marks;
    }
    
    public int getMarks() {
        return Subject_marks;
    }
   
}
