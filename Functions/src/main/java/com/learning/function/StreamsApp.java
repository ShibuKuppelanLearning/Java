package com.learning.function;

import java.util.List;
import java.util.stream.Stream;

public class StreamsApp {

   public static void main(String[] args) {
      List<Employee> employees = EmployeeUtil.createEmployees();
      System.out.println(employees.stream());
      System.out.println(employees.stream().filter(emp -> emp.getSalary() > 12000));
      System.out.println("Before Map operation :" + employees);

      Stream<Employee> empStream = employees.stream().map(emp -> {
         emp.setBonus(emp.getSalary() / 2);
         return emp;
      });

      System.out.println("After Map operation :" + employees);
      
      empStream.forEach(emp -> System.out.println(emp));
   }
}
