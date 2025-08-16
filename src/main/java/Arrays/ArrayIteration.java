package Arrays;

public class ArrayIteration {
    public static void main(String[] args)
    {
        int[] numby = {1,2,3,4,5,6};
        System.out.println("Length of array is " + numby.length );
        System.out.println("Memory address of the array is " + numby);
        //Iterating through array
        int a=0;
        for(int i =0; i<numby.length; i++)
        {
            a=i*2;
          //  System.out.println(a);
            System.out.println(numby[i]);
        }
    }
}
