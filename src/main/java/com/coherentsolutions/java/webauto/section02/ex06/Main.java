package com.coherentsolutions.java.webauto.section02.ex06;

public class Main {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = AdvancedStaticFinal.calculateCircleArea(radius);
        System.out.println("Area of the circle: " + area);

        AdvancedStaticFinal example = new AdvancedStaticFinal();
        example.displayMessage();
    }
}
