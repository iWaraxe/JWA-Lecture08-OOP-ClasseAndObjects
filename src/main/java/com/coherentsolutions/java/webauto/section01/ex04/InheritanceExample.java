package com.coherentsolutions.java.webauto.section01.ex04;

/**
 * Dog class inherits from Animal and adds breed and trick functionalities.
 */
public class InheritanceExample extends Animal {
    private String breed;

    /**
     * Constructor for Dog class.
     *
     * @param name  the name of the dog
     * @param age   the age of the dog
     * @param breed the breed of the dog
     */
    public InheritanceExample(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    /**
     * Dog barks, overriding makeSound method.
     */
    @Override
    public void makeSound() {
        System.out.println(getName() + " is barking");
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