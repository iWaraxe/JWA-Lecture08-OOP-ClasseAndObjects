package com.coherentsolutions.java.webauto.section02.ex07;

public class Main {
    public static void main(String[] args) {
        AdvancedConstructorOverloading emp1 = new AdvancedConstructorOverloading("John");
        AdvancedConstructorOverloading emp2 = new AdvancedConstructorOverloading("Jane", 25);
        AdvancedConstructorOverloading emp3 = new AdvancedConstructorOverloading("Jim", 30, "Developer");
        AdvancedConstructorOverloading emp4 = new AdvancedConstructorOverloading("Jack", 35, "Manager", 75000);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
    }
}
