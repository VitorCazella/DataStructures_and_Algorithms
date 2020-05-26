package com.gofly;

public class Man extends Human {
    private double salary;
    private String course;
    private double grade;

    public Man(String name, int phoneNumber, String address, double salary, String course, double grade) {
        super(name, phoneNumber, address);
        this.salary = salary;
        this.course = course;
        this.grade = grade;
    }

    public Man(double salary, String course, double grade) {
        this.salary = salary;
        this.course = course;
        this.grade = grade;
    }

    public void updateSalary(double newSalary) {
        salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }
}
