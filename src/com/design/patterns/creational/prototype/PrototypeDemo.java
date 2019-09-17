package com.design.patterns.creational.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        EmployeeRecord firstEmployee = new EmployeeRecord(1, "Denislav", 255, "Sofia");
        EmployeeRecord secondEmployee = (EmployeeRecord) firstEmployee.getClone();
        System.out.println(firstEmployee);
        System.out.println(secondEmployee);
    }
}
