package OOPS;

import java.util.Scanner;

public class PrintDiagonalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elemenst of 3*3 Array");
        int[][] exampleArray = new int[3][3];
        for(int i=0; i<exampleArray.length; i++)
        {
            for (int j=0; j<exampleArray[0].length; j++)
            {
                exampleArray[i][j] =scanner.nextInt();
            }
        }
        System.out.println("Printing the diagonal Elements of given array");
        for(int i=0; i<exampleArray.length; i++)
        {
            for (int j=0; j<exampleArray[0].length; j++)
            {
                if(i==j)
                {
                    System.out.printf("diagonal element %d is %d ", i, exampleArray[i][j]);
                    System.out.println();
                }
            }
        }
    }
}
