package OOPS;

public class MainMethodInterview {
    public static void main(String[] args) {
        System.out.println("Hi");
        String name = appData("Pramod");
        System.out.println(name);
        print("Satish");
    }
    static String appData(String s)
    {
        System.out.println("return with Param");
        return s + "Datta";
    }
    static void print(String s)
    {
        System.out.println("No return with param");
    }
}
