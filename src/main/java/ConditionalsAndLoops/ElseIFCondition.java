package ConditionalsAndLoops;

import java.util.Scanner;

public class ElseIFCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>20)
        {
            System.out.println("Number is greater than 20");
        }
        else if(num<10)
        {
            System.out.println("num <10");
        }
        else
        {
            System.out.println("Default");
        }
    }
}
