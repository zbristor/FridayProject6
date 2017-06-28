package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Scanner;
@Entity
public class Education {
@Id
private String email;
private String degree;
private String school;
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

	public void setEmail(String email) {
		this.email = email;
	}
}
