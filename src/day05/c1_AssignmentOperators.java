package day05;

public class c1_AssignmentOperators {
    public static void main(String[]arg){

        int x=100;
        int y=200;

        System.out.println(x + ", " +7);

        x= -y;
        System.out.println(x+" , " +y);

        x -= y;

        System.out.println(x+ " , " +y);

        // -= or += means add or remove to given number

        int z=10;
        int w=20;

        z=w-z+10+--z;   // --> z=20 -10 +10+9 = 29
        System.out.println(z);

        int a=10;

        a-= a+a-a+20;

        System.out.println(a);

        int number=20;
        number *= 2; // number = number *2

        System.out.println(number  );

        number /= 3.0;

        System.out.println(number);




    }
}
