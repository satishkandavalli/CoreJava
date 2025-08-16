package Arrays;

public class ArraysWithWhile {
    public static void main(String[] args)
    {
        int[] marks = new int[4];
        marks[0]=95;
        marks[1]=90;
        marks[2]=78;
        marks[3]=45;
        int size = marks.length;
        int i=0;
        while(i<size)
        {
            System.out.println(marks[i]);
            i++;
        }
    }
}
