package com.coherentsolutions.java.webauto.section01.ex01;

public class Main {
    /**
     * Main method to demonstrate creating and using a Dog object.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 5, "Brown");
        rex.bark();
        rex.eat();
        rex.sleep();
        System.out.println("Dog's name is: " + rex.getName());
    }
}
