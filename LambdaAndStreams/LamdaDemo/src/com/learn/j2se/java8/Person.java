package com.learn.j2se.java8;

import java.time.LocalDate;

public class Person {

	public enum Sex {
		MALE, FEMALE
	}

	private String name;
	private LocalDate birthday;
	private Sex gender;
	private String emailAddress;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return birthday.until(LocalDate.now()).getYears();
	}

	public void printPerson() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", gender=" + gender + ", emailAddress="
				+ emailAddress + "]";
	}

}
