package ConditionalsAndLoops;

import java.util.Scanner;

public class DaySelectorSwitch {
    public static void main(String[] args) {
        System.out.println("enter day number");
        Scanner sc = new Scanner(System.in);
        int daynum = sc.nextInt();
        switch(daynum)
        {
            case 1:
                System.out.println("day is monday");
                break;
            case 2:
                System.out.println("day is tuesday");
                break;
            case 3:
                System.out.println("day is Wednesday");
                break;
            case 4:
                System.out.println("day is thursday");
                break;
            case 5:
                System.out.println("day is friday");
                break;
            case 6:
                System.out.println("day is saturday");
                break;
            case 7:
                System.out.println("day is sunday");
            default:
                System.out.println("This is default");
        }
    }
}
