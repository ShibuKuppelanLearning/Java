package com.learning.function;

import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionApp {

   public static void main(String[] args) {
      BiFunction<List<Employee>, Integer, Employee> employeeBIFunction = (employeeList, empId) -> {
         Employee targetEmployee = null;
         for (Employee employee : employeeList) {
            if (empId.equals(employee.getEmployeeId())) {
               targetEmployee = employee;
               break;
            }
         }
         return targetEmployee;
      };

      List<Employee> employees = EmployeeUtil.createEmployees();
      System.out.println("Eployee : " + employeeBIFunction.apply(employees, 101));
   }

}
