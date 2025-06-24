package ConditionalsAndLoops;

public class SwitchDatatypesupported {
    public static void main(String[] args)
    {
        boolean esc = true;
//        switch(esc)
//        {
//
//        }
        /*
        Switch supported data types are int, short, byte, string, char
         */
        byte b=20;
        switch(b)
        {
            case 10:
                System.out.println("Ten");
            case 127:
                System.out.printf("One Twenty Eight");
        }
    }
}
