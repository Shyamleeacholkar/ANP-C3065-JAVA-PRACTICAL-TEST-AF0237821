package com.details;
import java.util.Scanner;
//class teacher
public class Teacher {
	//default constructor
	  public Teacher() {
		  
	    }
//method for set marks to students
	    public void setMarks(Student[] students) {
	        Scanner scanner = new Scanner(System.in);
	        for (Student student : students) {
	            System.out.println("Enter marks for student " + student.getName() + ":- ");
	            //entering marks for each student
	            for (Subject subject : student.getSubjects()) {
	                System.out.print(subject.getName() + ":-  ");
	                int marks = scanner.nextInt();
	                subject.setMarks(marks);
	            }
	        }
	    }
//method to find average marks of students 
	    public void findAverage(Student[] students) {
	        int totalMarks=0; int totalSubjects = 0;
	        for (Student student : students) {
	            for (Subject subject : student.getSubjects()) {
	                totalMarks += subject.getMarks();
	                totalSubjects++;
	            }
	        }
	        double averageMarks = (double) totalMarks / totalSubjects;
	        System.out.println("Average marks are: " + averageMarks);
	    }
//method for fin maximum and minimum marks using methods MIN_VALUE & MAX_VALUE
	    public void findMaxMin(Student[] students) {
	        int maxMarks = Integer.MIN_VALUE;
	        int minMarks = Integer.MAX_VALUE;
	        for (Student student : students) {
	            for (Subject subject : student.getSubjects()) {
	                int marks = subject.getMarks();
	                if (marks > maxMarks) {
	                    maxMarks = marks;
	                }
	                if (marks < minMarks) {
	                    minMarks = marks;
	                }
	            }
	        }
	        System.out.println("Maximum marks are: " + maxMarks);
	        System.out.println("Minimum marks are: " + minMarks);
	    }
}
