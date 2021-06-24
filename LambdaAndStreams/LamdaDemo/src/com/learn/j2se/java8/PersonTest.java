package com.learn.j2se.java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.learn.j2se.java8.Person.Sex;

public class PersonTest {

	interface CheckPerson {
		boolean test(Person p);
	}

	static class CheckPersonEligibleForSelectiveService implements CheckPerson {
		@Override
		public boolean test(Person p) {
			return p.getGender() == Person.Sex.MALE && p.getAge() >= 20 && p.getAge() <= 30;
		}

	}

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Mark", LocalDate.of(1987, 5, 17), Sex.MALE, "mark@test.com"));
		persons.add(new Person("Shane", LocalDate.of(1983, 3, 26), Sex.FEMALE, "shane@test.com"));
		persons.add(new Person("Bob", LocalDate.of(1992, 10, 23), Sex.MALE, "bob@test.com"));
		persons.add(new Person("Rusov", LocalDate.of(1995, 8, 10), Sex.FEMALE, "rusov@test.com"));
		persons.add(new Person("Kelly", LocalDate.of(1975, 11, 29), Sex.MALE, "kelly@test.com"));
		persons.add(new Person("Rita", LocalDate.of(1987, 4, 2), Sex.FEMALE, "rita@test.com"));

		System.out.println("*** Approach 1 ***");
		printPersonsOlderThan(persons, 34);

		System.out.println("*** Approach 2 ***");
		printPersonsWithinAgeRange(persons, 20, 30);		
		
		System.out.println("*** Approach 3 ***");
		printPersons(persons, new CheckPersonEligibleForSelectiveService());
		
		System.out.println("*** Approach 4 ***");
		printPersons(persons, new CheckPerson() {
			@Override
			public boolean test(Person p) {
				return p.getGender() == Person.Sex.MALE && p.getAge() >= 20 && p.getAge() <= 30;
			}
		});

		System.out.println("*** Approach 5 ***");
		printPersons(persons,
				p -> p.getAge() >= 20 && p.getAge() <= 30 && p.getGender() == Person.Sex.MALE);

		
	}

	public static void printPersonsOlderThan(List<Person> persons, int age) {
		for (Person p : persons) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	public static void printPersonsWithinAgeRange(List<Person> persons, int low, int high) {
		for (Person p : persons) {
			if (p.getAge() >= low && p.getAge() <= high) {
				p.printPerson();
			}
		}
	}

	public static void printPersons(List<Person> persons, CheckPerson checkPerson) {
		for (Person p : persons) {
			if (checkPerson.test(p)) {
				p.printPerson();
			}
		}
	}
}
