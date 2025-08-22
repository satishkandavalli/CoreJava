package OOPS;

public class SomeStringFunctions {
    public static void main(String[] args) {
        String name = "Satish";
        System.out.println(name.concat(" kandavalli"));
        System.out.println(name + " kandavalli");
        System.out.println(name.contains("a"));
        String expected = "password@123";
        String actual = "Password@123";
        System.out.println(expected.equalsIgnoreCase(actual));
    }
}
