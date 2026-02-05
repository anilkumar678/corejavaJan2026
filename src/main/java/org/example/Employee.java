package org.example;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Employee(int id, String name, int age, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }
}
