// File: com/coherentsolutions/java/webauto/section02/advanced/Ex02AdvancedStaticFinal.java
package com.coherentsolutions.java.webauto.section02.ex06;

/**
 * Demonstrates advanced use of static and final modifiers in Java.
 */
public class AdvancedStaticFinal {
    // Static final variable (constant)
    public static final double PI = 3.14159;

    // Static method
    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    // Final method
    public final void displayMessage() {
        System.out.println("This is a final method and cannot be overridden.");
    }
}