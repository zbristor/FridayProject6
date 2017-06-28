package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Scanner;
@Entity
public class Person {
	private String fname;
	private String lname;
	@Id
	private String email;
	private ArrayList<Education> eduArray = new ArrayList<Education>();
	private ArrayList<Work> workArray = new ArrayList<Work>();
	private ArrayList<Skills> skillArray = new ArrayList<Skills>();
public Person(String fname, String lname, String email, ArrayList<Education> eduArray, ArrayList<Work> workArray, ArrayList<Skills> skillArray)
{
	this.fname=fname;
	this.lname=lname;
	this.eduArray=eduArray;
	this.workArray=workArray;
	this.skillArray=skillArray;
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
public void addEdu(Education e){
	eduArray.add(e);
}
public void addWork(Work w)
{
	workArray.add(w);
}
public void addSkill(Skills s)
{
	skillArray.add(s);
}
}
