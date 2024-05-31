package com.coherentsolutions.java.webauto.section01.ex02;

/**
 * Represents an Employee with name, last name, age, position, and salary.
 */
public class Employee {
    private String name;
    private String lastName;
    private int age;
    private String position;
    private int salary;

    /**
     * Constructor for Employee class.
     *
     * @param name     the first name of the employee
     * @param lastName the last name of the employee
     * @param age      the age of the employee
     * @param position the position of the employee
     */
    public Employee(String name, String lastName, int age, String position) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }

    /**
     * Gets the name of the employee.
     *
     * @return name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the employee.
     *
     * @param name the new name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the last name of the employee.
     *
     * @return last name of the employee
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the employee.
     *
     * @param lastName the new last name of the employee
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the age of the employee.
     *
     * @return age of the employee
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the employee.
     *
     * @param age the new age of the employee
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the position of the employee.
     *
     * @return position of the employee
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the position of the employee.
     *
     * @param position the new position of the employee
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Gets the salary of the employee.
     *
     * @return salary of the employee
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary the new salary of the employee
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}