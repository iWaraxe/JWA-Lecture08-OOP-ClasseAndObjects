package com.coherentsolutions.java.webauto.section02.ex05;

public class AdvancedAccessModifiers extends BaseClass {
    // Public method overriding the base class method
    @Override
    public void display() {
        super.display(); // Call the base class method
        System.out.println("DerivedClass Display Method");
    }
}
