// File: com/coherentsolutions/java/webauto/section02/Ex01AccessModifiers.java
package com.coherentsolutions.java.webauto.section02;

/**
 * Demonstrates different access modifiers in Java.
 */
public class Ex01AccessModifiers {
    // Default access modifier (package-private)
    String defaultMessage = "This is the default access modifier";

    // Private access modifier
    private String privateMessage = "This is the private access modifier";

    // Public access modifier
    public String publicMessage = "This is the public access modifier";

    // Protected access modifier
    protected String protectedMessage = "This is the protected access modifier";

    // Getters for private fields
    public String getPrivateMessage() {
        return privateMessage;
    }

    public static void main(String[] args) {
        Ex01AccessModifiers example = new Ex01AccessModifiers();
        System.out.println(example.defaultMessage);
        System.out.println(example.getPrivateMessage());
        System.out.println(example.publicMessage);
        System.out.println(example.protectedMessage);
    }
}
