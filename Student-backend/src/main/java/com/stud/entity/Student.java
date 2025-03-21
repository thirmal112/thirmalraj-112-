package com.stud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
    private String rollno;
    private String name;
    private String emailaddress;
    private String phno;
    private String department;
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", emailaddress=" + emailaddress + ", phno=" + phno
				+ ", department=" + department + "]";
	}
	public Student(String rollno, String name, String emailaddress, String phno, String department) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.emailaddress = emailaddress;
		this.phno = phno;
		this.department = department;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
	

}
