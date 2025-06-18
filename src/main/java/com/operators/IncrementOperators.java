package com.operators;

public class IncrementOperators {
    public static void main(String[] args) {
        //Increment Operator ++
        //Pre Increment and Post Increment
        int a=10;
        System.out.println(++a); //First increment and then print
        int b=11;
        System.out.println(b++); //First print and then increment

        int d=10;

        //Find the value of expression best Interview question
        System.out.println(++d + d++ + d++);
        System.out.println(d);
        //Part - A (Exp =11, d=11) --> ++d --> O/p -->11
        //Part - B (Exp =11, d=12) --> d++ --> O/p -->12
        //Part - C (Exp=12, d=13) --> d++ --> O/p --> 12
        //Total Output A+B+C 11+12+12 = 34

        //Example 2
        int B=10;
        System.out.println(++B + B++);
        System.out.println(B);

    }
}
