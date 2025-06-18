package operators;

public class StringNewOperator {
    public static void main(String[] args)
    {
        String s1 = "Satish";
        //String constant pool - SCP / String Pool
        //new operator - Object
        String s2 = new String("Satish");
        //new operator is used to create the new object for class
        //It returns the address of newly created object
        System.out.println(s2);
        String s3 = new String("Satish");
        System.out.println(s2.equals(s3));
        System.out.println(s2==s3); //Check refernces
    }
}
