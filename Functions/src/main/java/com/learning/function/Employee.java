package com.learning.function;

public class Employee {

   private int employeeId;

   private String name;

   private String designation;

   private int managerId;

   private double salary;

   private double bonus;

   public Employee() {

   }

   public Employee(int employeeId, String name, String designation, int managerId) {
      super();
      this.employeeId = employeeId;
      this.name = name;
      this.designation = designation;
      this.managerId = managerId;
   }

   public Employee(int employeeId, String name, String designation, int managerId, double salary, double bonus) {
      super();
      this.employeeId = employeeId;
      this.name = name;
      this.designation = designation;
      this.managerId = managerId;
      this.salary = salary;
      this.bonus = bonus;
   }

   public int getEmployeeId() {
      return employeeId;
   }

   public void setEmployeeId(int employeeId) {
      this.employeeId = employeeId;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDesignation() {
      return designation;
   }

   public void setDesignation(String designation) {
      this.designation = designation;
   }

   public int getManagerId() {
      return managerId;
   }

   public void setManagerId(int managerId) {
      this.managerId = managerId;
   }



   public double getSalary() {
      return salary;
   }


   public void setSalary(double salary) {
      this.salary = salary;
   }


   public double getBonus() {
      return bonus;
   }

   public void setBonus(double bonus) {
      this.bonus = bonus;
   }

   @Override
   public String toString() {
      return "\nEmployee [employeeId=" + employeeId + ", name=" + name + ", designation=" + designation + ", managerId=" + managerId + ", salary=" + salary
            + ", bonus=" + bonus + "]";
   }
}
