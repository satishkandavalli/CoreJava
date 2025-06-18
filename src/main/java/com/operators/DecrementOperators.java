package com.operators;

public class DecrementOperators {
    public static void main(String[] args) {
        int b=10;
        System.out.println(--b + b++ + ++b); //29
        System.out.println(b); //11
    }
}
