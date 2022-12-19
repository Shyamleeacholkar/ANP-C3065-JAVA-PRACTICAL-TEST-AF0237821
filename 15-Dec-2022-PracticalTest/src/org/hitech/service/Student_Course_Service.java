package org.hitech.service;
import java.util.HashMap;
import org.hitech.dao.Student_Course_DAO;
import org.hitech.model.Cource;
import org.hitech.model.Student;

	public class Student_Course_Service {
		
	Student_Course_DAO daoObj=new Student_Course_DAO();
	
	public void addStudentCourseDetails(Student Sr,Cource Cu){
		daoObj.addStudentCourseDetails(Sr,Cu);
	}
	
	public HashMap<Student,Cource> getStudentCourseDetails() {
		
		return daoObj.getStudentCourseDetails();
	}
	public void deleteStudentCourseDetails(Student s) {
		daoObj.deleteStudentCourseDetails(s);
	}
}