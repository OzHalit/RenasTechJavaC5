package day04;

public class c6_AssignmentOperators {

    private static int number;

    public static void main(String[]args){

        int
                number=125;
        System.out.println(number);

        //if you want to reassign your number to 100

        number=100;

        System.out.println(number);
        
        int number2=25;
        
        number2=number;
        
        System.out.println(number);

        int x=10;
        x=x+10;

        System.out.println(x);
        x=x+30;

        System.out.println(x);

        x+=100;
        System.out.println(x);

        int y=20;
        y=y+20;
        y+=20;
        y*=2;
        System.out.print("y equals: "+y);

    }
}
