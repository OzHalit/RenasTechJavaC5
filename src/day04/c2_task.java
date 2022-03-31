package day04;

public class c2_task {
    public static void main(String[]args){

        int x=20;
        int y=x +7;
        int z=y +8;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println("Sum of numbers are: " +(x+y+z)   );

        boolean boo1=x>=9;

        System.out.println(boo1);

        boolean divby2= x% 2==0;
        boolean divby3= x% 3==0;
        boolean divby5=x%5==0;

        System.out.println("is " +(x)+ " divisible by 2? "  +(divby2)+ "\nis it divisible by 3? "+(divby3)+ "\nwell...what about by 5? "+(divby5));




    }
}
