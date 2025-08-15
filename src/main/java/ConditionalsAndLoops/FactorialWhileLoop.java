package ConditionalsAndLoops;

import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the required number");
        Long factorialValue =1l;
        int number = sc.nextInt();
        int i=1;
        while(i<=number)
        {
            if(number==0 || number==1)
            {
                factorialValue=1l;
                break;
            }
            factorialValue = factorialValue*i;
            i++;
        }
        System.out.println("value of factorial is " + factorialValue);
        sc.close();
    }
}
