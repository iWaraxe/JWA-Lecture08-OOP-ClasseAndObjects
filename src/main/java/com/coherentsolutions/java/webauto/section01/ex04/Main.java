package com.coherentsolutions.java.webauto.section01.ex04;

public class Main {

    /**
     * Main method to demonstrate inheritance.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        InheritanceExample max = new InheritanceExample("Max", 4, "Beagle");
        max.makeSound();
        System.out.println("Dog's name is: " + max.getName());
        System.out.println("Dog's age is: " + max.getAge());
        System.out.println("Dog's breed is: " + max.getBreed());
    }
}
