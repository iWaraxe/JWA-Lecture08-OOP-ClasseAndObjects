package com.coherentsolutions.java.webauto.section01.ex04;

/**
 * Demonstrates inheritance with a base class Animal and derived class Dog.
 */
class Animal {
    private String name;
    private int age;

    /**
     * Constructor for Animal class.
     *
     * @param name the name of the animal
     * @param age  the age of the animal
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Animal makes a sound.
     */
    public void makeSound() {
        System.out.println(name + " is making a sound");
    }

    /**
     * Gets the name of the animal.
     *
     * @return name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of the animal.
     *
     * @return age of the animal
     */
    public int getAge() {
        return age;
    }
}

