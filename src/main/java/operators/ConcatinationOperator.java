package operators;

public class ConcatinationOperator {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        String s1 = "Satish";
        String s2 = "Kandavalli";
        System.out.println(a+b+s1+s2); //30SatishKandavalli
        System.out.println(s1+s2+a+b); //SatishKandavalli1020
        System.out.println(s1+s2+(a+b)); //SatishKandavalli30 BODMAS
    }
}
