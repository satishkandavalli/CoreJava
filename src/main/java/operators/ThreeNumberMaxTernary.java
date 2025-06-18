package operators;

public class ThreeNumberMaxTernary {
    public static void main(String[] args) {
      int a=40;
      int b=20;
      int c=32;
      int max = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(max);
    }
}
