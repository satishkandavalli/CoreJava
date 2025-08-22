package OOPS;

public class StringImmutabilityDemo {
    public static void main(String[] args)
    {
        String name = "Satish"; //String pool
        String name2 = new String("Satish"); //Heap Area
        name = "Kandavalli";
        String str1 ="Hello";
        String str2 = str1.concat(" World"); //This operation doesnt change str1 it just changes str2
        String str3 = "world";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
