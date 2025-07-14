package ConditionalsAndLoops;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args)
    {
        System.out.println("Enter your name, age and salary");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        double salary = sc.nextDouble();
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My salary is " + salary);
    }
}