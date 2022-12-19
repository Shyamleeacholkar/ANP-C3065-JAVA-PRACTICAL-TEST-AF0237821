package org.hitech.dao;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.hitech.model.Cource;
import org.hitech.model.Student;

public class Student_Course_DAO {
private static HashMap<Student,Cource> hashMap=new HashMap<Student,Cource>();
	
	Student student=new Student();
	Cource course=new Cource();
	
	public void addStudentCourseDetails(Student Sr,Cource Cu){
		HashMap hashMap2 = new HashMap();
		hashMap2.put(Sr, Cu);
	}
	public HashMap<Student,Cource> getStudentCourseDetails() {
		return hashMap;
	}
	public void deleteStudentCourseDetails(Student s)
	{
			hashMap.remove(student);
	}

}

