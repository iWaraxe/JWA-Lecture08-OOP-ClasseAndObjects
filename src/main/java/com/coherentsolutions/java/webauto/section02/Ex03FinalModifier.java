// File: com/coherentsolutions/java/webauto/section02/Ex03FinalModifier.java
package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the use of final variables and classes in Java.
 */
public class Ex03FinalModifier {
    // Final variable
    public final int finalVariable = 10;

    // Static final variable (constant)
    public static final int CONSTANT = 100;

    public static void main(String[] args) {
        Ex03FinalModifier example = new Ex03FinalModifier();
        System.out.println("Final Variable: " + example.finalVariable);
        System.out.println("Constant: " + Ex03FinalModifier.CONSTANT);

        Ex03FinalClass ex03FinalClass = new Ex03FinalClass();
        ex03FinalClass.display();
    }
}

// Final class
final class Ex03FinalClass {
    // Method in final class
    public void display() {
        System.out.println("This is a method in a final class");
    }
}