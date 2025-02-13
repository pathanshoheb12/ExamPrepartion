package com.oops.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfEmployeeSorting {

    public static void main(String[] args) {

        List<Employee> listOfEmployee = new ArrayList<>();

        Employee employee1 = new Employee(1200, "Sham");
        Employee employee2 = new Employee(2000, "Raaj");
        Employee employee3 = new Employee(10000, "Alice");
        Employee employee4 = new Employee(1200, "Bob");

        listOfEmployee.add(employee1);
        listOfEmployee.add(employee2);
        listOfEmployee.add(employee3);
        listOfEmployee.add(employee4);

       Comparator<Employee> employeesSortingIfNameSame = new Comparator<Employee>() {

           @Override
           public int compare(Employee o1, Employee o2) {
               if(o1.getEmployeeSalary()==o2.getEmployeeSalary())
               {
                   return o1.getEmployeeName().compareTo(o2.getEmployeeName());
               }
               else
               {
                   return o1.getEmployeeSalary()-o2.getEmployeeSalary();
               }



           }
       };
        Collections.sort(listOfEmployee, employeesSortingIfNameSame);
        System.out.println("==================================");
        for (Employee employee : listOfEmployee) {
            System.out.println(employee);
        }




    }
}
