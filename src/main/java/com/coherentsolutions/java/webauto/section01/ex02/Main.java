package com.coherentsolutions.java.webauto.section01.ex02;

public class Main {
    /**
     * Main method to demonstrate creating and using Employee objects.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Employee tester1 = new Employee("John", "Doe", 30, "Tester");
        Employee tester2 = new Employee("Jane", "Smith", 25, "Tester");
        Employee developer1 = new Employee("Jim", "Brown", 40, "Developer");
        Employee developer2 = new Employee("Jack", "White", 35, "Developer");
        Employee officeManager = new Employee("Jill", "Green", 28, "Office Manager");

        tester1.setSalary(50000);
        tester2.setSalary(52000);
        developer1.setSalary(70000);
        developer2.setSalary(72000);
        officeManager.setSalary(45000);

        System.out.println(tester1.getName() + " is a " + tester1.getPosition() + " earning " + tester1.getSalary());
        System.out.println(tester2.getName() + " is a " + tester2.getPosition() + " earning " + tester2.getSalary());
        System.out.println(developer1.getName() + " is a " + developer1.getPosition() + " earning " + developer1.getSalary());
        System.out.println(developer2.getName() + " is a " + developer2.getPosition() + " earning " + developer2.getSalary());
        System.out.println(officeManager.getName() + " is a " + officeManager.getPosition() + " earning " + officeManager.getSalary());
    }
}
