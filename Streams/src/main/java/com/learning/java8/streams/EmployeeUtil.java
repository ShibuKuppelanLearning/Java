package com.learning.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {

	public static List<Employee> createEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(100, "Suresh", "VP", "Management", "ECOM", 0, 5000, 50000));
		employees.add(new Employee(101, "Mukesh", "Manager", "Management", "ECOM", 100, 4000, 40000));
		employees.add(new Employee(102, "Rajesh", "Software Engineer", "Java", "IT", 101, 1200, 12000));
		employees.add(new Employee(103, "Sanjay", "Software Engineer", "Java", "IT", 101, 1400, 14000));
		return employees;
	}
}
