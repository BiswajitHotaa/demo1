package com.learn.Hibernate.HibernatePractice;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student
{
	@Id
	int sId;
	String sName;
	
	@ManyToMany
	List<Technology> technology;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sId, String sName, List<Technology> technology) {
		this.sId = sId;
		this.sName = sName;
		this.technology = technology;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public List<Technology> getTechnology() {
		return technology;
	}

	public void setTechnology(List<Technology> technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", technology=" + technology + "]";
	}
}
