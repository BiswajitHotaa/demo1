package com.learn.Hibernate.HibernatePractice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology 
{
	@Id
	int techId;
	String techName;
	
	@ManyToMany
	List<Student> student;

	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technology(int techId, String techName, List<Student> student) {
		this.techId = techId;
		this.techName = techName;
		this.student = student;
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Technology [techId=" + techId + ", techName=" + techName + ", student=" + student + "]";
	}
}
