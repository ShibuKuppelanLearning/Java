package com.learning.function;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApp {

   public static void main(String[] args) {
      List<Employee> employees = EmployeeUtil.createEmployees();
      // System.out.println(employees.stream());
      // System.out.println(employees.stream().filter(emp -> emp.getSalary() > 12000));
      // System.out.println("Before Map operation :" + employees);
      //
      Stream<Employee> empStream = employees.stream().map(emp -> {
         emp.setBonus(emp.getSalary() / 2);
         return emp;
      });
      //
      // System.out.println("After Map operation :" + employees);
      
      // empStream.forEach(emp -> System.out.println(emp));
      System.out.println(employees.stream().collect(Collectors.toMap(Employee::getEmployeeId, Employee::getName)));
      OptionalDouble totalSalary = employees.stream().mapToDouble(Employee::getSalary).reduce((empASalary, empBSalary) -> (empASalary + empBSalary));
      System.out.println("Total Salary :" + totalSalary.getAsDouble());
   }
}
