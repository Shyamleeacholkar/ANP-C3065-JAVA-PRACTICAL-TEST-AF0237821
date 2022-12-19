package org.hitech.model;

import java.util.Objects;

public class Cource {
	private int courseId;
	private String courseName;
	private double price;
	
	public Cource() {
		
	}
	public Cource(int courseId, String courseName, double price) {
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
		Cource other = (Cource) obj;
		return courseId == other.courseId && Objects.equals(courseName, other.getCourseName())
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.getPrice());
	}
	
	
}