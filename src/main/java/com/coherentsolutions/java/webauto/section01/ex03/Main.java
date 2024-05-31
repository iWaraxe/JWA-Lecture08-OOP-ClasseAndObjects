package com.coherentsolutions.java.webauto.section01.ex03;

public class Main {

    /**
     * Main method to demonstrate creating and using an Advanced Dog object.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        AdvancedDog buddy = new AdvancedDog("Buddy", 3, "Golden", "Golden Retriever");
        buddy.bark();
        buddy.eat();
        buddy.sleep();
        buddy.learnTrick("Sit");
        buddy.learnTrick("Fetch");

        System.out.println("Dog's name is: " + buddy.getName());
        System.out.println("Dog's breed is: " + buddy.getBreed());
    }
}
