package Arrays;

public class FizzBuzz {
    public static void main(String[] args)
    {
        /*
        Write a program from 1 to 100
        for multiples of 3, print fizz instead of the number
        for multiples of 5, enter Buzz
        for multiples of 3  and 5 print "fizzBuzz"
         */
        for(int i=0; i<100; i++)
        {
            if((i%3==0) && (i%5==0))
            {
                System.out.println( i + "is fizzbuzz");
            }
            else if (i%3==0)
            {
                System.out.println( i + "is fizz");
            }
            else if (i%5==0)
            {
                System.out.println( i + "is buzz");
            }
        }
    }
}
