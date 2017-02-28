package com.app.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String name;
	String address;
	String surname;
	String grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
