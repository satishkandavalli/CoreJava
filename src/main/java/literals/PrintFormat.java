package literals;

public class PrintFormat {
    public static void main(String[] args)
    {
        //sout is the shortcut for println
        /*
        * shortcut for  main method is main keyword
        * print statement just prints but no format
        *  println creates new line after printing
        * printf is used for formating
        * We use %d for int, byte, short
        * We use %f is double and float
        * We use %c for character
        * %s is used to print string
        * lew line can be crated through \n ('back slash n)'
         */
        System.out.print("This si print example");
        System.out.println("This is used to create a new line");
        int age =23;
        System.out.printf("My age is %d", age);
        //Second way of printing age through concatination
        System.out.println("Modified age is " + 25);
        float pie = 3.12458466f;
        double ex = 1234575.4454644;
        char ch = 'Z';
        //souf is the shortcut for formatting
        System.out.printf("pie value is %f \n", pie);
        System.out.printf("double value is %f \n", ex);
        System.out.printf("cha value is %c \n", ch);
        //Multiple arguments example
        System.out.printf("1* %d = %d*2", 8, 2);
    }
}
