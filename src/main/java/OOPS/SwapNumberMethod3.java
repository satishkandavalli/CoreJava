package OOPS;

import java.util.Scanner;

public class SwapNumberMethod3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second Number");
        int secondNu = scanner.nextInt();
        System.out.printf("Numbers before the swap are %d, %d ", firstNum, secondNu);
        firstNum = firstNum*secondNu;
        secondNu=firstNum/secondNu;
        firstNum=firstNum/secondNu;
        System.out.println();
        System.out.printf("Numbers after the swap are %d, %d ", firstNum, secondNu);
    }
}
