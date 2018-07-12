package com.learning.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class App {
	private static final String JAVA = "Java";

	public static void main(String[] args) {
		List<Employee> employees = EmployeeUtil.createEmployees();

		/*
		 * Map<String, List<Employee>> employeeDepartmentGroup =
		 * employees.stream().collect(groupingBy(Employee::getDepartment));
		 * employeeDepartmentGroup.entrySet().stream().forEach(entry -> {
		 * System.out.println(entry.getKey());
		 * entry.getValue().stream().forEach(System.out::println); });
		 * 
		 * Map<String, List<Employee>> employeeSkillSetGroup =
		 * employees.stream().collect(groupingBy(Employee::getSkillSet));
		 * employeeSkillSetGroup.entrySet().stream().forEach(entry -> {
		 * System.out.println(entry.getKey());
		 * entry.getValue().stream().forEach(System.out::println); });
		 * 
		 * Map<String, Map<String, List<Employee>>>
		 * employeeDepartmentSkillSetGroup = employees.stream()
		 * .collect(groupingBy((Employee::getDepartment),
		 * groupingBy(Employee::getSkillSet)));
		 * employeeDepartmentSkillSetGroup.entrySet().stream().forEach(entry ->
		 * { System.out.println(entry.getKey());
		 * entry.getValue().entrySet().stream().forEach(innerEntry -> {
		 * System.out.println(innerEntry.getKey() + "\t" +
		 * innerEntry.getValue()); }); });
		 */

		System.out.println(employees);

		Map<Boolean, List<Employee>> javaAndNonJavaSkillSetEmployees = employees.stream()
				.collect(Collectors.partitioningBy(emp -> StringUtils.equalsIgnoreCase(JAVA, emp.getSkillSet())));
		javaAndNonJavaSkillSetEmployees.entrySet().stream().forEach(entry -> {
			String empNames = entry.getValue().stream().map(Employee::getName).reduce((name1, name2) -> StringUtils.join(name1, ",", name2))
					.orElse(StringUtils.EMPTY);
			System.out.println(empNames + " is Java Skilled ? " + entry.getKey());
		});

		Map<Boolean, Map<Boolean, List<Employee>>> javaAndNonJavaSkillSetEmployeesWithGoodSalary = employees.stream()
				.collect(Collectors.partitioningBy(emp -> StringUtils.equalsIgnoreCase(JAVA, emp.getSkillSet()),
						Collectors.partitioningBy(emp -> emp.getSalary() > 50000)));

		javaAndNonJavaSkillSetEmployeesWithGoodSalary.entrySet().stream().forEach(outerEntry -> {
			outerEntry.getValue().entrySet().stream().forEach(innerEntry -> {
				String empNames = innerEntry.getValue().stream().map(Employee::getName).reduce((name1, name2) -> StringUtils.join(name1, ",", name2))
						.orElse(StringUtils.EMPTY);
				System.out.println(empNames + " is Java Skilled ? " + outerEntry.getKey() + " is Salary above 50000 ? " + innerEntry.getKey());
			});
		});
	}
}
