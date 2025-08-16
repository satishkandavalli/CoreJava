package Arrays;

public class ArrayNormalInitialization {
    public static void main(String[] args) {
        int[][] table = {{1,2}, {3,4}, {5,6}};
        for (int i=0; i<table.length; i++)
        {
            for (int j=0; j<table[0].length; j++)
            {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
