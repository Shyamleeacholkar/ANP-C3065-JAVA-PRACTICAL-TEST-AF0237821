package org.hitech.model;
import java.util.Objects;

public class Student extends Cource
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
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return Objects.equals(qualification, other.getQualification()) && studentId == other.getStudentId();
		}
		
		
	} 
