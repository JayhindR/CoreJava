package com.jay.comparator;

import java.time.LocalDate;

public class Student {
	public String studentName;
	public String studentId;
	public LocalDate dob;

	public Student(String studentName, String studentId, LocalDate dob) {

		this.studentName = studentName;
		this.studentId = studentId;
		this.dob = dob;
	}

	public String getStudentName() {
		return studentName;
	}
	
	/*public String toString() {
		return "Student [dob=" + dob +  ", studentId="
				+ studentId + ", studentName=" + studentName + "]";
	}*/
	
	public String toString() {
		return "Student ["+ dob +  ", " + studentId + ", " + studentName + "]";
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
