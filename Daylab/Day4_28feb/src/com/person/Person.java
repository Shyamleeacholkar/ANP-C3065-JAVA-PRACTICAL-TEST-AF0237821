package com.person;
//interface
 interface Person {
    void speak();
}
//implementing student through person
class Student implements Person {
    public void speak() {
        System.out.println("Hi,I am a student.");
    }
}
//implementing teacher through person
class Teacher implements Person {
    public void speak() {
        System.out.println("Hi,I am a teacher.");
    } 
    public static void main(String[] args) {
        // create objects of Student and Teacher
        Student student = new Student();
        Teacher teacher = new Teacher();
        // call speak methods
        student.speak();
        teacher.speak();
    }
}
