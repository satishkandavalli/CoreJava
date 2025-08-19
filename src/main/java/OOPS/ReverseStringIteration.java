package OOPS;

import java.util.Scanner;

public class ReverseStringIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be reveresed");
        String requiredString = scanner.nextLine();
        String reversedString ="";
        char[] requiredCharArray = requiredString.toCharArray();
        for(int i =requiredCharArray.length-1; i>=0 ; i--)
        {
            reversedString = reversedString+requiredCharArray[i];
        }
        System.out.println(reversedString);
    }
}
