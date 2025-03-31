package com.springcore;

public class Student {

	
	private int studentID;
	private String studentName;
	private String StudentAddress;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public Student(int studentID, String studentName, String studentAddress) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		StudentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", StudentAddress=" + StudentAddress
				+ "]";
	}
	
	
}
