package ConditionalsAndLoops;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args)
    {
        //Triangle classifier"
        /*
        Write a program that classifies a triangle based on its side lengths
        Given three input values representing the lengths of sides determine
        if the triangle is equilateral (all sides are equal)
        Isosceles (exactly two sides are equal), or
        Scalene (no sides are equal)
        Use an if-else statement to classify the triangle
         */
        //side 1, side 2, side 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sides of triangle");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if(side1==side2 && side2==side3)
        {
            System.out.println("Its Equilateral triangle");
        } else if (side1!=side2 && side2!=side3 && side3!=side1) {
            System.out.println("It is scalene triangle");
        }
        else
        {
            System.out.println("It is Isosceles triangle");
        }
    }
}
