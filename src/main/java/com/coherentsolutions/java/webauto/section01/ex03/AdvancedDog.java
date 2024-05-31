// File: com/coherentsolutions/java/webauto/section01/advanced/Ex01AdvancedDog.java
package com.coherentsolutions.java.webauto.section01.ex03;

/**
 * Represents a Dog with advanced features such as breed and tricks.
 */
public class AdvancedDog {
    private String name;
    private int age;
    private String color;
    private String breed;
    private String[] tricks;

    /**
     * Constructor for Dog class.
     *
     * @param name  the name of the dog
     * @param age   the age of the dog
     * @param color the color of the dog
     * @param breed the breed of the dog
     */
    public AdvancedDog(String name, int age, String color, String breed) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.tricks = new String[0]; // Initialize with no tricks
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
     * Adds a new trick to the dog's tricks.
     *
     * @param trick the new trick to add
     */
    public void learnTrick(String trick) {
        String[] newTricks = new String[tricks.length + 1];
        System.arraycopy(tricks, 0, newTricks, 0, tricks.length);
        newTricks[tricks.length] = trick;
        tricks = newTricks;
        System.out.println(name + " learned a new trick: " + trick);
    }

    /**
     * Gets the name of the dog.
     *
     * @return name of the dog
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the breed of the dog.
     *
     * @return breed of the dog
     */
    public String getBreed() {
        return breed;
    }
}
