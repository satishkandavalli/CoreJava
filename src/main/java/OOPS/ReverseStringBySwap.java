package OOPS;

import java.util.Scanner;

public class ReverseStringBySwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be reversed");
        String required = scanner.nextLine();
        char[] stringarray = required.toCharArray();
        char[] reversedArray = new char[stringarray.length];
        for(int i=0; i<stringarray.length; i++)
        {
            reversedArray[stringarray.length-1-i] =stringarray[i];
        }
        String reveresedstring = new String(reversedArray);
        System.out.printf("%s is the reveresed string", reveresedstring);
    }
}
