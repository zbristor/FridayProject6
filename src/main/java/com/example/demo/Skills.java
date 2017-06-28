package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Scanner;
@Entity

public class Skills {
@Id
private String email;
private String skill;
public Skills(){
	
}
public Skills(String skill)
{
	this.skill=skill;
}
public String getSkill()
{
	return skill;
}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
