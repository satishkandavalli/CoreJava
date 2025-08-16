package Arrays;

public class ArraysExample2 {
    public static void main(String[] args)
    {
        int[] sample = {5,75,7,69,55,};
        System.out.println(sample.length);
        System.out.println(sample[0]);
        System.out.println(sample[1]);
        // System.out.println(sample[5]); This is array out of bound exception

        int[] second = new int[5];
        // This initializes the value to [0,0,0,0] which is default value of int
        second[2] =2;
        System.out.println(second[2]);

        //This is interview question
        final int[] sampley = new int[5];
        sampley[4] =4;
        System.out.println(sampley[4]); //This is still valid because final is applied to array length not the values
    }
}
