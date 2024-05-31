// File: com/coherentsolutions/java/webauto/section01/Ex01Dog.java
package com.coherentsolutions.java.webauto.section01.ex01;

/**
 * Represents a Dog with a name, age, and color.
 */
public class Dog {
    private String name;
    private int age;
    private String color;

    /**
     * Constructor for Dog class.
     *
     * @param name  the name of the dog
     * @param age   the age of the dog
     * @param color the color of the dog
     */
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * Dog barks.
     */
    public void bark() {
        System.out.println(name + " is barking");
    }

    /**
     * Dog eats.
     */
    public void eat() {
        System.out.println(name + " is eating");
    }

    /**
     * Dog sleeps.
     */
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    /**
     * Gets the name of the dog.
     *
     * @return name of the dog
     */
    public String getName() {
        return name;
    }
}
