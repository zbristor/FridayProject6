package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Scanner;
@Entity

public class Skills {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private int skillID;
private String email;
private String skill;
public Skills(){
	
}
public Skills(String email, String skill){
	this.email=email;
	this.skill=skill;
}
public Skills(String skill)
{
	this.skill=skill;
}
public String getSkill()
{
	return skill;
}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSkillID() {
		return skillID;
	}

	public void setSkillID(int skillID) {
		this.skillID = skillID;
	}
}
