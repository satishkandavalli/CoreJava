package ConditionalsAndLoops;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("please Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("This is even");
        }
        else
        {
            System.out.println("This is odd");
        }
    }
}
