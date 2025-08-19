package OOPS;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = scanner.nextInt();
        int[] UserInput = new int[size];
        for(int i=0; i<UserInput.length; i++)
        {
            System.out.printf("Enter the number in psoition %d ", i);
            UserInput[i] = scanner.nextInt();
        }
        System.out.println("Printing out the array ");
        for(int i=0; i<UserInput.length; i++)
        {
            System.out.println(UserInput[i]);

        }
        scanner.close(); //It is very important to close the scanner
    }
}
