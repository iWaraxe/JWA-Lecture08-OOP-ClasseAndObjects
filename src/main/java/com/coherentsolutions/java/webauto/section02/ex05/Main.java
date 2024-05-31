package com.coherentsolutions.java.webauto.section02.ex05;

public class Main {
    public static void main(String[] args) {
        AdvancedAccessModifiers obj = new AdvancedAccessModifiers();
        obj.display();
        System.out.println(obj.protectedVar);
        System.out.println(obj.getPrivateVar());
    }
}
