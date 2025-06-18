package com.java.TyepCastingAndOthers;

public class TypeCasting {
    public static void main(String[] args)
    {
      //Casting molding
        //Broadening --> Implicit casting
        byte b =10;
        int a = b; //Implicit casting JVM handles it as there is no loss of bits
        int c = (int)b; //Explict casting is valid too, but we need not do it JVM handles it

        //Narrowing JVM Explicit casting is required because there is loss of bits
        int d = 300;
       // byte e = d; this is implicit casting and it is invalid
        byte e = (byte) d;
        System.out.println(e);
        // 32 bits
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0 --> 32 bits
        //300 needs 9 bits to represent in this 32 bits (1 0 0 1 0 1 1 0 0)
        //but byte can hold only 8 bits --> 9th bit on the left side is lost (handled by JVM)
        // 0 0 1 0 1 1 0 0 --> value is 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = 44.

    }
}
