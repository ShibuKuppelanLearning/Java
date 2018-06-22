package com.learning.function;

import java.util.function.BiConsumer;

public class BiConsumerApp {

   public static void main(String[] args) {
      BiConsumer<String, Double> empNameAndSalaryBIConsumer = (empName, salary) -> System.out.println("Employee name : " + empName + " salary : " + salary);
      BiConsumer<String, Double> empNameAndBonusBIConsumer = (empName, salary) -> System.out.println("Employee name : " + empName + " bonus : " + salary / 2);
      BiConsumer<String, Double> empNameSalaryAndBonusBIConsumer = empNameAndSalaryBIConsumer.andThen(empNameAndBonusBIConsumer);

      Employee employee = EmployeeUtil.createEmployee();
      empNameAndSalaryBIConsumer.accept(employee.getName(), employee.getSalary());
      empNameAndBonusBIConsumer.accept(employee.getName(), employee.getSalary());
      empNameSalaryAndBonusBIConsumer.accept(employee.getName(), employee.getSalary());
   }

}
