package Arrays;

public class ArrayInterviewQuestion {
    public static void main(String[] args) {
        int[] ara1 = {1,2,3,4,5};
        int[] ara2 = {1,2,3,4,5};
        System.out.println(ara1==ara2); //This value is false because content is matching and length is matching but they are pointing to different objects
        int[] aray3 =ara2;
        System.out.println(aray3==aray3); //This value is trur because we are pointing the array to previous array
        ara2[3]=79;
        System.out.println(aray3==aray3); //This is true even after updating because they are pointing to the same location
        System.out.println(aray3[3]);
        aray3[0] = 24;
        System.out.println(aray3[0]);
        System.out.println(ara2[0]); // If either of ara2 or aray3 is changed it is reflected on the other array
    }
}
