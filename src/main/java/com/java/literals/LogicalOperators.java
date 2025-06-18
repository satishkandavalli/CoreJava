package com.java.literals;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operator
        // !, &&, ||
        // ! -> Not, with boolean or condition
        boolean a = true;
        System.out.println(a);
        System.out.println(!a);
        System.out.println(!(10>20));
        System.out.println((30>20));

        //Logical or operator
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);

        System.out.println("********************");
        //Logical and operator
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

    }
}
