package com.pmain;
import com.persondetails.Student;
//main class
public class PMain {
	 public static void main(String[] args) {
		 //object creation
	        Student myStudent = new Student("Shamli Acholkar", 25,"B.E(Final Year)");
	        //method calling
	        myStudent.speak();
	        myStudent.study();
	    }
}
