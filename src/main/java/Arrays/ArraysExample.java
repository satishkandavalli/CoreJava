package Arrays;

public class ArraysExample {
    public static void main(String[] args)
    {
        int[] num = {1,2,3,4,5,6,7};
      //  int[] num1 = {1.0,2,3,4,5,6,7}; this is invalid
        String[] groceries = {"Coke", "Coffee", "Boost", "BornVita", "Choclate"};
        System.out.println(groceries.length); //it displays the length
        System.out.println(groceries[2]);
       // System.out.println(groceries[6]); //ArrayIndexOutOfBoundsException
    }
}
