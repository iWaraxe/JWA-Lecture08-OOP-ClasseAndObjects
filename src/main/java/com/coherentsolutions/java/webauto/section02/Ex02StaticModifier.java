// File: com/coherentsolutions/java/webauto/section02/Ex02StaticModifier.java
package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates the use of static variables and methods in Java.
 */
public class Ex02StaticModifier {
    // Static variable
    public static int staticCount = 0;

    // Instance variable
    public int instanceCount = 0;

    // Static method
    public static void incrementStaticCount() {
        staticCount++;
    }

    // Instance method
    public void incrementInstanceCount() {
        instanceCount++;
    }

    public static void main(String[] args) {
        // Accessing static method
        Ex02StaticModifier.incrementStaticCount();
        System.out.println("Static Count: " + Ex02StaticModifier.staticCount);

        // Accessing instance method
        Ex02StaticModifier example = new Ex02StaticModifier();
        example.incrementInstanceCount();
        System.out.println("Instance Count: " + example.instanceCount);
    }
}
