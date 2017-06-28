package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Scanner;
@Entity
public class Work {
@Id
private String email;
private String position;
private String company;
private String start;
private String end;
private String duties;
private ArrayList<String> duty;

public Work()
{
	
}
public Work(String position, String company, String start, String end, String duties)
{
	this.position=position;
	this.company=company;
	this.start=start;
	this.end=end;
	this.duties=duties;
	this.email=email;
}

public ArrayList<String> getDuty() {
	return duty;
}
public void setDuty(ArrayList<String> duty) {
	this.duty = duty;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getStart() {
	return start;
}
public void setStart(String start) {
	this.start = start;
}
public String getEnd() {
	return end;
}
public void setEnd(String end) {
	this.end = end;
}
public String getDuties() {
	return duties;
}
public void setDuties(String duties) {
	this.duties = duties;
}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
