package com.learning.function;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.BiPredicate;

public class BiPredicateApp {

   public static void main(String[] args) {

      List<Employee> employees = EmployeeUtil.createEmployees();

      BiPredicate<Employee, Employee> biPredicate = (employee1, employee2) -> employee1.getEmployeeId() == employee2.getManagerId();
      BiPredicate<Employee, List<Employee>> biPredicateAnd = (employee1, emps) -> {
         boolean result = false;
         try {
            result = emps.stream().filter(emp -> employee1.getEmployeeId() == emp.getManagerId()).findFirst().get() != null;
         } catch (NoSuchElementException e) {
         }
         return result;
      };

      System.out.println(employees.get(0).getName() + " -> " + employees.get(1).getName() + " : " + (biPredicate.test(employees.get(0), employees.get(1))));
      System.out.println(employees.get(0).getName() + " -> " + employees.get(2).getName() + " : " + (biPredicate.test(employees.get(0), employees.get(2))));
      System.out.println(employees.get(0).getName() + " -> " + employees.get(3).getName() + " : " + (biPredicate.test(employees.get(0), employees.get(3))));

      System.out.println(employees.get(1).getName() + " -> " + employees.get(0).getName() + " : " + (biPredicate.test(employees.get(1), employees.get(0))));
      System.out.println(employees.get(1).getName() + " -> " + employees.get(2).getName() + " : " + (biPredicate.test(employees.get(1), employees.get(2))));
      System.out.println(employees.get(1).getName() + " -> " + employees.get(3).getName() + " : " + (biPredicate.test(employees.get(1), employees.get(3))));

      System.out.println(employees.get(2).getName() + " -> " + employees.get(0).getName() + " : " + (biPredicate.test(employees.get(2), employees.get(0))));
      System.out.println(employees.get(2).getName() + " -> " + employees.get(1).getName() + " : " + (biPredicate.test(employees.get(2), employees.get(1))));
      System.out.println(employees.get(2).getName() + " -> " + employees.get(3).getName() + " : " + (biPredicate.test(employees.get(2), employees.get(3))));

      System.out.println(employees.get(3).getName() + " -> " + employees.get(0).getName() + " : " + (biPredicate.test(employees.get(3), employees.get(0))));
      System.out.println(employees.get(3).getName() + " -> " + employees.get(1).getName() + " : " + (biPredicate.test(employees.get(3), employees.get(1))));
      System.out.println(employees.get(3).getName() + " -> " + employees.get(2).getName() + " : " + (biPredicate.test(employees.get(3), employees.get(2))));

      if (employees != null && employees.size() > 0) {
         for (Employee employee : employees) {
            System.out.println(employee.getName() + " Is Manager : " + biPredicateAnd.test(employee, employees));
         }
      }

   }
}
