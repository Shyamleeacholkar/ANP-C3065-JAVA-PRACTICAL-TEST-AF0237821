package com.details;
import java.util.Scanner;
//create class main for execution
public class Main {
    public static void main(String[] args) {
    	// we are creating an array of Subject objects and initializing it with two Subject objects. 
        Subject[] subjects = { new Subject("Maths", 0), new Subject("English", 0) };
        //we are creating an array of Student objects and initializing it with 10 Student objects.
        Student[] students = {
            new Student("shaml",1, subjects),
            new Student("sam",2, subjects),
            new Student("dev",3, subjects),
            new Student("gita",4, subjects),
            new Student("hina",5, subjects),
            new Student("samrudhhi",6, subjects),
            new Student("om",7, subjects),
            new Student("Amy",8, subjects),
            new Student("ajit",9, subjects),
            new Student("ankush",10, subjects)
        };
        //calling methods with the help of object to set the marks and find average and Min - max marks
        Teacher teacher = new Teacher();
        teacher.setMarks(students);
        teacher.findAverage(students);
        teacher.findMaxMin(students);
    }
}
