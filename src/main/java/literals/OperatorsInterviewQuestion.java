package literals;

public class OperatorsInterviewQuestion {
    public static void main(String[] args)
    {
        int a= 10;
        int b=45;
        String name = "Satish";
        System.out.println(a+b);
        //Operation goes from left to right
        System.out.println(a+name);
        System.out.println(name+b);
        //output is 55Satish , baceuse operation goes from left to right, so addition followed by concatination
        System.out.println(a+b+name);
        //output Satish1045 , bacuse from left it starts with string concatination and follows
        System.out.println(name+a+b);
    }
}
