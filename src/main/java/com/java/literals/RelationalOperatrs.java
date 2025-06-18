package com.java.literals;

public class RelationalOperatrs {
    public static void main(String[] args) {
        // create variables
        int a = 7, b = 11;

        // value of a and b
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

        // > operator
        System.out.println(a > b);  // false

        // < operator
        System.out.println(a < b);  // true

        // >= operator
        System.out.println(a >= b);  // false

        // <= operator
        System.out.println(a <= b);  // true

        System.out.println('A'==65); //ASCII code
        //In the print statement comparision operator '==' is supported but not the assignment operator '='
        System.out.println('A'==65.0); //ASCII code true

        //System.out.println(true <= b);
        //System.out.println(true <= true); these are invalid statements because between two booleans we cannot compare
    }
}
