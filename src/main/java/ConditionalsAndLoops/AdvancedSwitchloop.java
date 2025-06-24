package ConditionalsAndLoops;

public class AdvancedSwitchloop {
    public static void main(String[] args) {
        //After JDK 13
        int num = 10;
        switch(num)
        {
            case 5, 10:
                System.out.printf("this is exact");
                break;
            case 12, 14, 16:
                System.out.printf("THis is not exact");
                break;

        }
    }
}
