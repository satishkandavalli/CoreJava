package operators;

public class TernaryOperator {
    public static void main(String[] args) {
        //Ternary Operator
        // int a = condition? If this is true do this : If false do this
        int a = true? 10:20;
        int a1 = (30>40) ? 10:20;
        System.out.println(a);
        System.out.println(a1);
        String str = 10>20 ? "10" : "TWENTY";
        System.out.println(str);
        String anil_status = true? "Yes" : "No";
        System.out.println(anil_status);
    }
}
