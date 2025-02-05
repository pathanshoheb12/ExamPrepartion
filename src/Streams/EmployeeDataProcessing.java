package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        //

        List<Employee> employees = Arrays.asList(new Employee(1, "Alice", "Engineering", 75000), new Employee(2, "Bob", "HR", 50000), new Employee(3, "Charlie", "Engineering", 80000), new Employee(4, "David", "Sales", 60000));

        System.out.println("Filtering all employees who belong to the “Engineering” department.");

        List<Employee> employeesBelongToEngineering = employees.stream().filter(x -> x.getDepartment().equals("Engineering")).collect(Collectors.toList());
        for (Employee e : employeesBelongToEngineering) {
            System.out.println(e);
        }


        System.out.println("Sort the employees by their salary in descending order.");
        List<Employee> salaryDescendingOrder = employees.stream().sorted((x, y) -> (int) (y.getSalary() - x.getSalary())).collect(Collectors.toList());
        for (Employee e : salaryDescendingOrder) {
            System.out.println(e);
        }
        //Create list of employee names.
        System.out.println("list of employee names.");
        List<String> listOfNames = employees.stream().map(x -> x.getName()).toList();

        for (String name : listOfNames) {
            System.out.print(name + " ");
        }
        System.out.println();
        //Calculate the total salary of all employees.
        double sum = employees.stream().mapToDouble(x -> x.getSalary()).sum();
        System.out.println("Total Salary is : " + sum);

        //Group employees by their department
        Map<String, List<Employee>> groupByDepartment = employees.stream().collect(Collectors.groupingBy(x -> x.getDepartment()));

        System.out.println(groupByDepartment);


    }
}
