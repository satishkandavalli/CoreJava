package Arrays;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        //take input marks of 5 subjects and print the marks
        Scanner scanner = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the first subject marks");
        marks[0]=scanner.nextFloat();
        System.out.println("Enter the second subject marks");
        marks[1]=scanner.nextFloat();
        System.out.println("Enter the third subject marks");
        marks[2]=scanner.nextFloat();
        System.out.println("Enter the fourth subject marks");
        marks[3]=scanner.nextFloat();
        System.out.println("Enter the fifth subject marks");
        marks[4]=scanner.nextFloat();
        scanner.close();
        //While entering the mark, we need not specify f
        for(int i =0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
            if(marks[i]<35)
            {
                System.out.println("You failed in this subject");
            }
        }
    }
}
