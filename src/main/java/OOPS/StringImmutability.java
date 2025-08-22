package OOPS;

public class StringImmutability {
    public static void main(String[] args) {
        String s1 = "Pramod";
        String s2 = new String("Pramod");
        s1.concat(" Dutta"); //New string will be created in the String pool
        System.out.println(s1); //This is immutable as intial string remains unchanged

        StringBuffer sb1 = new StringBuffer("Satish");
        sb1.append(" Kandavalli");
        System.out.println(sb1); //Mutable and value is changed

        StringBuilder sb2 = new StringBuilder("Sam");
        sb2.append("Sung"); //Value of sb2 changes because it is mutable
        System.out.println(sb2);

    }
}
