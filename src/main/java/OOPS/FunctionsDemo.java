package OOPS;

public class FunctionsDemo {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c= sumy(a,b); //Arguments
        int d= sumy(a); //Call of the function
        int e= sumy(); //No argument function
        Hello(); //calling Voids function
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
    public static int sumy(int s, int u) //Definition of the Function
    {
        return s+u;
    }
    public static int sumy(int s)
    {
        return s; //Example of Method overloading --> JVM automatically selects the method
    }

    public static int sumy()
    {
        return 99;
    }
    public static void Hello()
    {
        System.out.println("Say Hello");
        //Example of Void return type
    }
}
