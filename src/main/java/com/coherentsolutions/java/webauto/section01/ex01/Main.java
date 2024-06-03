package com.coherentsolutions.java.webauto.section01.ex01;

public class Main {
    /**
     * Main method to demonstrate creating and using a Dog object.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 5, "Brown");
        Dog tRex = new Dog("tRex", 3, "Green");

        Cat cat = new Cat();
        System.out.println(rex.getAge());
        rex.setAge(-6);
        System.out.println(rex.getAge());
        rex.bark();
        rex.eat();
        rex.sleep();
        System.out.println("Dog's name is: " + rex.getName());
    }
}
