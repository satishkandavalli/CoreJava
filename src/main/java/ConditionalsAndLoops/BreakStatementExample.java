package ConditionalsAndLoops;

public class BreakStatementExample {
    public static void main(String[] args)
    {
        for (int i=1; i<=10; i++)
        {
            if(i==5)
            {
                break;
            }
            System.out.println("The value of interest is " + i);
        }
        System.out.println("This is end of the for loop");
    }
}
