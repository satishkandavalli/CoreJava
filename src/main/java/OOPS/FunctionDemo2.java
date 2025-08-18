package OOPS;

public class FunctionDemo2 {
    public static void main(String[] args) {
        /*
        What is a function?
        Function can perform task


        Function (Used in non OOPs) vs methods (Used in OOPS)
         */
        System.out.println(args[0]);
        System.out.println(args.length);
        System.out.println(args[1]);


    }

    public static void main(int a) {
        System.out.println("Another main");
    }
    public static int main(int a, int b, int c) {
        return 99;
    }
    public static void main(int a, int b) {
        System.out.println("Another type of main");
    }
}
