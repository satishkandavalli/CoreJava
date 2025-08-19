package OOPS;

import java.util.Scanner;

public class StringReversalNoInbuiltNoCharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String Required = scanner.nextLine();
        String finalString="";
        for(int i=Required.length()-1; i>=0; i--)
        {
            finalString = finalString + Required.charAt(i);
        }
        System.out.println(finalString);

    }
}
