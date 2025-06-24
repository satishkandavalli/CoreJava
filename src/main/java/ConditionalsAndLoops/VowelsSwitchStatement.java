package ConditionalsAndLoops;

import java.util.Scanner;

public class VowelsSwitchStatement {
    public static void main(String[] args) {
        System.out.println("Enter the character of Interest");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        switch(ch)
        {
            case 'a':
                System.out.println("This vowel");
                break;
            case 'e':
                System.out.println("This vowel");
                break;
            case 'i':
                System.out.println("This vowel");
                break;
            case 'o':
                System.out.println("This vowel");
                break;
            case 'u':
                System.out.println("This vowel");
                break;
            default:
                System.out.println("This is is not a vowel");
        }
    }
}
