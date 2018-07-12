package com.learning.function;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {

   public static List<Employee> createEmployees() {
      List<Employee> employees = new ArrayList<>();
      employees.add(new Employee(100, "Suresh", "VP", 0, 50000, 0));
      employees.add(new Employee(101, "Mukesh", "Manager IT", 100, 40000, 0));
      employees.add(new Employee(102, "Rajesh", "Software Engineer", 101, 12000, 0));
      employees.add(new Employee(103, "Sanjay", "Software Engineer", 101, 14000, 0));
      // System.out.println(employees);
      return employees;
   }

   public static Employee createEmployee() {
      return new Employee(100, "Suresh", "VP", 0, 50000, 25000);
   }
}
