package Arrays;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        scanner.close();
        /*
        condition  of the leap year is divisibe by 4 but not 100
        or divisible by 400
         */
        if((year%4==0 && year%100!=0)||(year%400==0) )
        {
            System.out.println("This year is leap year " + year);
        }
        else
        {
            System.out.println("This year is not a leap year " + year);
        }
    }
}
