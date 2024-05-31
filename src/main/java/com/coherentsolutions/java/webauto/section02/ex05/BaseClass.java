package com.coherentsolutions.java.webauto.section02.ex05;
// File: com/coherentsolutions/java/webauto/section02/advanced/Ex01AdvancedAccessModifiers.java

/**
 * Demonstrates advanced use of access modifiers and inheritance in Java.
 */
class BaseClass {
    // Private variable, accessible only within the same class
    private String privateVar = "Private Variable";

    // Protected variable, accessible within the package and by subclasses
    protected String protectedVar = "Protected Variable";

    // Public method
    public void display() {
        System.out.println("BaseClass Display Method");
    }

    // Getter for private variable
    public String getPrivateVar() {
        return privateVar;
    }
}