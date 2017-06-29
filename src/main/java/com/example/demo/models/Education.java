package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Scanner;
@Entity
public class Education {

	@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private int eduID;
@NotNull
private String email;
@NotNull
private String degree;
@NotNull
private String school;
@NotNull
private String year;

public Education()
{
	
}
public Education(String degree, String school, String year)
{
	this.degree=degree;
	this.school=school;
	this.year=year;
	this.email=email;
}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getEmail() {
		return email;
	}
	public int getEduID() {
		return eduID;
	}

	public void setEduID(int eduID) {
		this.eduID = eduID;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
