package ConditionalsAndLoops;

import java.util.Scanner;

public class MathEquation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x, y,z");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println("THe result is " + result);
        sc.close();
    }
}
