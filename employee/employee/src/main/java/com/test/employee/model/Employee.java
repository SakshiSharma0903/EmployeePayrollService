package com.test.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;

private String firstName;

private String lastName;

private int age;

private Long ctc;

private String organisation;

public Employee(Long id, String firstName, String lastName, int age, Long ctc, String organisation) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.ctc = ctc;
	this.organisation = organisation;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public Long getCtc() {
	return ctc;
}

public void setCtc(Long ctc) {
	this.ctc = ctc;
}

public String getOrganisation() {
	return organisation;
}

public void setOrganisation(String organisation) {
	this.organisation = organisation;
}




}
