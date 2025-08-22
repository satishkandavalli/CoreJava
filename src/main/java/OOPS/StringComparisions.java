package OOPS;

public class StringComparisions {
    public static void main(String[] args) {
        String name = "Satish";
        String name1 = new String("Satish");
        System.out.println(name==name1); //false because they point to different memory locations in heap ans String constant pool
        System.out.println(name.equals(name1)); //True because it Checks the content
        String name2 = new String("Satish");
        System.out.println(name1==name2); //false because each new keyword creates a new string Object
        String name3 = new String("satish");
        System.out.println(name2.equalsIgnoreCase(name3)); //true because it compares value of the string ignoring cases

    }
}
