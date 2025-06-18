package literals;

public class Datatypes {
    public static void main(String[] args)
    {
        byte b=10;
        short s =123;
        int age =4;
        long phone = 123456789000L; //If we dont use 'L' or 'l' for long values out of range of integer it will thow an error,
        // if no L is given java compiler will consider at as int if its below the range of Long, if value is greater that integer range it will throw an error saying include L
        System.out.println(phone);
        //When we use float we have to use 'f' or 'F' at the end, to deffrentiate between float and double
        float f = 12.34f;
        double d = 12.3248;
        char character = 'C'; //we can only use single quotes, the moment you use , double quotes it becomes string
        char c1 = '!';
        char c22 = '@';
        char $ = '#';
       // We cannot use _ because it is a keyword but you can use _1
        System.out.println($);

    }
}
