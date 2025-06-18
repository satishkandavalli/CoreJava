package literals;

public class DataTypeConversion {
    public static void main(String[] args) {
        byte b = 10;
        final float pi = 3.145f;
        System.out.println(pi);
        //Final values cannot be changed in the program, fianl is a keyword
        char c = 'A';
        // char s = "$"; this is string literal and it creates error
        char c2 = '\n'; //new line
        System.out.printf(String.valueOf(c2));
        char c3 = '\u0041';
        System.out.printf(String.valueOf(c3));
        //ASCII table range
        /*
        0-9 48-57
        A-Z 65-90
        a-z 97-122
         */
        char ch10 = '\u0062';
        System.out.println(ch10);

        //Different ways of storing INteger
        //Decimal system ;
        int age = 10;
        System.out.println(age);
        //Octal
        int b454 = 0101;
        System.out.println(b454);
        //Binary
        int b2 = 0b101;
        System.out.println(b2);
        //Hexadecimal
        int c45 = 0X456;
        System.out.println(c45);

        //CHar to ASCII code
        char ch3 = 'S';
        int asciivalue = (int) ch3;
        System.out.println("ASCII value is " + asciivalue);

        //ASCII to character
        int asciii = 97;
        char ch4556 = (char) asciii;
        System.out.println("ASCII to character is "+ ch4556);

    }
}
