package ConditionalsAndLoops;

public class AdvancedSwitch2 {
    public static void main(String[] args) {
        //This doesnt require break statement if we use ->
        int req =10;
        switch(req)
        {
            case 2 -> System.out.printf("THis is beautiful");
            case 5,10,15 -> System.out.println("This is multiple of 5");
            default -> System.out.println("This is default");
        }
    }
}
