package OOPS;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to check if it is palindrome or not");
        String sb1 = scanner.nextLine();
        StringBuilder sb3 = new StringBuilder(sb1);
        sb3.reverse();
        String sb2 = sb3.toString();
//        System.out.println(sb3.equals(sb3.reverse()));
//        System.out.println(sb3);
       System.out.println(sb1.equals(sb2));
       if(sb1.equals(sb2))
       {
           System.out.println(sb1 + " is palindrome");
       }
       else
       {
           System.out.println(sb1 + " is not palindrome");
       }
       scanner.close();
    }
}
