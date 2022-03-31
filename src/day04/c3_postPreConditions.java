package day04;

public class c3_postPreConditions {

    public static void main(String []args){

        int x=10;

        System.out.println(x);
        System.out.println(++x); //pre condition will increase your number by one immediately
        System.out.println(x);
        System.out.println(+x);

        int y=20;
        System.out.println(y);
        System.out.println(y++);//post condition will not effect number right away, it will effect on next step
        System.out.println(y+x);
    boolean boo1=y+x ==x+y;

    System.out.println(boo1);
        System.out.println(--x);

        int number2=50;
        System.out.println(number2--);
        System.out.println(number2--);
        System.out.println(--number2);
        System.out.println(number2);
        System.out.println(number2++);
        System.out.println(number2);







    }
}
