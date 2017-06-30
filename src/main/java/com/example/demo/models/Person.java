package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Scanner;
@Entity
public class Person {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int personID;
	private String fname;
	private String lname;
	private String email;
public Person()
{

}
public Person(String fname, String lname, String email)
{
	this.fname=fname;
	this.lname=lname;
	this.email=email;
}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}

