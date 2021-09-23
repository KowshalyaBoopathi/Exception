package com.collections;

public class Student {
	int rollNumber;
	String name;
	String subject;
	public Student(int rollNumber, String name, String subject) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.subject = subject;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", subject=" + subject + "]";
	}
}

