package com.operators;

public class StringFunctions {
    public static void main(String[] args) {
        String name = "The testing Academy"; //String constant pool or Object Area or Heap --> Object area /heap
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        String name1 = new String("The testing Academy"); //Is it Object area or heap area, some people dont know whaat Object area is , so say Heap area
        //String constant pool only create new string when there is no similar string in SCP

        String ex = "Satish";
        String ex1 = "Satish"; //This doesnt create new string as it is in SCP
        String ex2 = new String ("satish");
        System.out.println(ex==ex1); //true
        System.out.println(ex.equals(ex1)); //true
        System.out.println(ex==ex2); //false
        System.out.println(ex.equals(ex2)); //false
        System.out.println(ex.equalsIgnoreCase(ex2)); //trur
        //String comparision is case dependent
        System.out.println(ex.concat(ex2));

    }
}
