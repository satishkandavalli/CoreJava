package ConditionalsAndLoops;

import java.util.Scanner;

public class GradingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score");
        int score = sc.nextInt();
        if(score>=90 && score<=100)
        {
            System.out.println("Your grade is A");
        }
        else if(score>=80 && score<=89)
        {
            System.out.println("Your grade is 'B'");
        }
       else  if(score>=70 && score<=79)
        {
            System.out.println("Your grade is 'C'");
        }
        else if(score>=60 && score<=69)
        {
            System.out.println("Your grade is 'D'");
        }
        else
        {
            System.out.println("Your garde is F");
        }
// We add debugging at the conditions or where we want to view our variables

    }
}
