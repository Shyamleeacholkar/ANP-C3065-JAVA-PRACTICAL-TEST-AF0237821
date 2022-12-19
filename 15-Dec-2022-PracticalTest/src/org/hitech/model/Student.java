package org.hitech.model;
import java.util.Objects;

public class Student extends Course
{	
		private int studentId;  
		private String studentName;
		private String qualification;
		
		public Student() {
			
		}
		public Student(int studentId, String studentName, String Qualification) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.qualification = Qualification;
		}
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", qualification=" + qualification
					+ "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(qualification, studentId, studentName);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return Objects.equals(qualification, other.qualification) && studentId == other.studentId
					&& Objects.equals(studentName, other.studentId);
		}
		
		
	} 
class Course {
	private int courseId;
	private String courseName;
	private double price;
	
	public Course() {
		
	}
	public Course(int courseId, String courseName, double price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.price = price;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseId, courseName, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseId == other.courseId && Objects.equals(courseName, other.courseName)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	
}

