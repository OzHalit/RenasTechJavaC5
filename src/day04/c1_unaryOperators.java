package day04;

public class c1_unaryOperators {

    public static void main(String[]args){
        int number1=20;
        int number2=15;

        //number3= +number1;
        int number3= +number1;
        int number4= -number1;

        System.out.println("Number 3 : "+number3);
        System.out.println("Number 4 : "+number4);

        int x=10;
        int y=-x; //y= -10

        boolean b1=y>0;
        boolean b2= x>0;

        System.out.println(b1);
        System.out.println(b2);

        int i1=-15;
        int i2= +i1;
        int i3=i1 + -i1;
        int i4= -i1;
        int i5=-i3;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);







    }
}
