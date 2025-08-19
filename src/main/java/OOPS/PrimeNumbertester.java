package OOPS;

import java.util.Scanner;

public class PrimeNumbertester {
    public static void main(String[] args)
    {
        //A number is prime number if it is only divisible by 1 or itself
        //The smallest prime number is 2
        //So the logic is check from 2 to number/2 that the number doesnt give reminder 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of your interest");
        boolean primebility =true;
        int requiredNum = scanner.nextInt();
        if(requiredNum==0 || requiredNum ==1)
        {
            System.out.println("this is not a prime number");
        }
        else
        {
            for(int i=2; i<requiredNum/2 ; i++)
            {
                if(requiredNum%i==0)
                {
                    primebility =false;
                    System.out.println("This is not a prime number");

                    break;
                }
            }
            if(primebility==true)
            {
                System.out.printf("% d is prime number", requiredNum);
            }
        }

    }
}
