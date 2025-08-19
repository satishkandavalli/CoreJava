package OOPS;

public class ExpressionInterviewQuestion {
    public static void main(String[] args) {
        int b=10;
        int c=10;
        int d =--c + c++ + c--;
        System.out.println(--b + b++ + b--);
        //A --> Expression value 9 , b value is 9 (--b)
        //B --> Expression value 9 , b value is 10 (b++)
        //C --> Expression value 10, b value is 9 (b--)
        //So the output will be 28
        System.out.println("Using expressions on assignment value is " + d);
    }
}
