package com.shape;
//base class
public abstract class Shape //abstract class shape
{
    public abstract double calculateArea(); //abstract method
}
class Circle extends Shape {   //derived class circle with methods  extending shape class
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
    	//PI value is 3.14159265
        return 3.14159265 * radius * radius;
    }
}
class Rectangle extends Shape {  //derived class rectangular with methods extending shape class
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        // create objects of Circle and Rectangle
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(5, 6);
        
        // call their respective calculateArea methods
        // should print area of circle
        System.out.println("Area of Circle: " + circle.calculateArea()); 
        //// should print area of rectangle
        System.out.println("Area of Rectangle: " + rectangle.calculateArea() + "cm"); 
    }
}
