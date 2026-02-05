package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Anil", 28, "Male", 50000),
                new Employee(2, "Sita", 25, "Female", 45000),
                new Employee(3, "Ravi", 30, "Male", 60000),
                new Employee(4, "Priya", 27, "Female", 48000),
                new Employee(5, "Kumar", 35, "Male", 70000)
        );
        Map<String,Double> genderCount=employees.stream().
                collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(genderCount);

    }
}
