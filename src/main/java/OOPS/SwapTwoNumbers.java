package OOPS;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second Number");
        int secondNum = scanner.nextInt();
        System.out.printf("Before the swap, first number is %d and second number is %d", firstNum, secondNum);
        int temp;
        temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println();
        System.out.printf("After the swap, first number is %d and second number is %d", firstNum, secondNum);
    }
}
