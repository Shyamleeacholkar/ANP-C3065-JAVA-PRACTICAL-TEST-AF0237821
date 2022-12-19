package org.hitech.view;
import java.util.Scanner;
import org.hitech.dao.Student_Course_DAO;
import org.hitech.model.Cource;
import org.hitech.model.Student;

public class Student_Course_View {

	public static void main(String[] args) {
		
		Student_Course_DAO serviceGives=new Student_Course_DAO();
		Scanner sc=new Scanner(System.in);
		
		Student Sr = null;
		Cource Cu = null;
		for(int i=1;i<=2;i++) {
			serviceGives.addStudentCourseDetails(Sr, Cu);
			System.out.println("Enter Student Id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name:");
			String name=sc.next();
			sc.nextLine();
			System.out.println("Enter Student qualification:");
			String qual=sc.next();
			sc.nextLine();
			System.out.println("Enter Student courseName:");
			String course=sc.next();
			sc.nextLine();
		}
		
	}

}