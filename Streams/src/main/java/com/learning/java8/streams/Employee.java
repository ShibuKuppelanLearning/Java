package com.learning.java8.streams;

public class Employee {

	private double bonus;

	private String department;

	private String designation;

	private int employeeId;

	private int managerId;

	private String name;

	private double salary;

	private String skillSet;

	public Employee() {

	}

	public Employee(int employeeId, String name, String designation, String skillSet, String department, int managerId, double bonus, double salary) {
		super();
		this.bonus = bonus;
		this.designation = designation;
		this.employeeId = employeeId;
		this.managerId = managerId;
		this.department = department;
		this.name = name;
		this.salary = salary;
		this.skillSet = skillSet;
	}

	public double getBonus() {
		return bonus;
	}

	public String getDepartment() {
		return department;
	}

	public String getDesignation() {
		return designation;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public int getManagerId() {
		return managerId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	@Override
	public String toString() {
		return "\nEmployee [bonus=" + bonus + ", department=" + department + ", designation=" + designation + ", employeeId=" + employeeId
				+ ", managerId=" + managerId + ", name=" + name + ", salary=" + salary + ", skillSet=" + skillSet + "]";
	}

}
