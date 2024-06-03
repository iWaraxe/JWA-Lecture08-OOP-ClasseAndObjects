// File: com/coherentsolutions/java/webauto/section02/Ex04ConstructorOverloading.java
package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates constructor overloading in Java.
 */
public class Ex04ConstructorOverloading {
    private String name;
    private int age;
    private String position;

    // Constructor with one parameter
    public Ex04ConstructorOverloading(String name) {
        this.name = name;
    }

    public Ex04ConstructorOverloading(String position, boolean isPosition) {
        this.position = position;
    }

    public Ex04ConstructorOverloading(int age, String position) {
        this.age = age;
        this.position = position;
    }

    // Constructor with two parameters
    public Ex04ConstructorOverloading(String name, int age) {
        this(name); // Call the constructor with one parameter
        this.age = age;
    }

    // Constructor with three parameters
    public Ex04ConstructorOverloading(String name, int age, String position) {
        this(name, age); // Call the constructor with two parameters
        this.position = position;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Position: " + position;
    }

    public static void main(String[] args) {
        Ex04ConstructorOverloading emp1 = new Ex04ConstructorOverloading("John");
        Ex04ConstructorOverloading emp2 = new Ex04ConstructorOverloading("Jane", 25);
        Ex04ConstructorOverloading emp4 = new Ex04ConstructorOverloading(26,"Developer");
        Ex04ConstructorOverloading emp3 = new Ex04ConstructorOverloading("Jim", 30, "Developer");

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
