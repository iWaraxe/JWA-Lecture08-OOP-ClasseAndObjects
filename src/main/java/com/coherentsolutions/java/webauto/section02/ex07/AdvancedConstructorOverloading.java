// File: com/coherentsolutions/java/webauto/section02/advanced/Ex03AdvancedConstructorOverloading.java
package com.coherentsolutions.java.webauto.section02.ex07;

/**
 * Demonstrates advanced constructor overloading and the use of the 'this' keyword.
 */
public class AdvancedConstructorOverloading {
    private String name;
    private int age;
    private String position;
    private double salary;

    // Constructor with one parameter
    public AdvancedConstructorOverloading(String name) {
        this.name = name;
    }

    // Constructor with two parameters
    public AdvancedConstructorOverloading(String name, int age) {
        this(name); // Call the constructor with one parameter
        this.age = age;
    }

    // Constructor with three parameters
    public AdvancedConstructorOverloading(String name, int age, String position) {
        this(name, age); // Call the constructor with two parameters
        this.position = position;
    }

    // Constructor with four parameters
    public AdvancedConstructorOverloading(String name, int age, String position, double salary) {
        this(name, age, position); // Call the constructor with three parameters
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Position: " + position + ", Salary: " + salary;
    }
}
