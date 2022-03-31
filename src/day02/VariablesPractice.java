package day02;

public class VariablesPractice {
    //This is the second portion of the homework

//    1. Please create a class call variablePractice and make sure to create at least
//       5 different example for each data type we learned (byte,int,short,long,double,float)
//    2.  create 5 number and use arithmetic operators (+ - )
//       use each operator at least 3 times for your numbers

    public static void main(String[]args) {

        //byte examples start here
        System.out.println("byte examples start here:");
        byte b1 = 2;
        byte b2 = 4;
        byte b3 = 6;
        byte b4 = 8;
        byte b5 = 10;

        System.out.print(b1+b2);
        System.out.print(" ");
        System.out.print(b5-b3);
        System.out.print(" ");
        System.out.print(b1*b5);

        //short examples start here
        System.out.println("\n\nshort examples start here:");
        short s1 = -200;
        short s2 = 130;
        short s3 = 131;
        short s4 = -150;
        short s5 = 150;
    System.out.print(s1+s1);
        System.out.print(" ");
    System.out.print(s1+s5);
        System.out.print(" ");
    System.out.print(b1*s5);

    //int examples start here
        System.out.println("\n\nint examples start here:");
        int i1=50000;
        int i2=42000;
        int i3=-33000;
        int i4=-40000;
        int i5=100000;

        System.out.print(b1*i1);
        System.out.print(" ");
        System.out.print(i5-i1);
        System.out.print(" ");
        System.out.print(b1+s2+i2);

        //long examples start here
        System.out.println("\n\nlong examples start here:");

        long l1=1000000000L;
        long l2=150000000000L;
        long l3=160000000000L;
        long l4=170000000000L;
        long l5=200000000000L;

        System.out.print(l1*1);
        System.out.print(" ");
        System.out.print(l2-l1);
        System.out.print(" ");
        System.out.print(l3+l1);

        //float examples start here
        System.out.println("\n\nfloat examples start here:");

        float f1=1.555555f;
        float f2=2.5555f;
        float f3=3.5555f;
        float f4=10.111111f;
        float f5=8.22f;

        System.out.print(f5*f5);
        System.out.print(" ");
        System.out.print(f1+f2);
        System.out.print(" ");
        System.out.print(f1*f5);

        //double examples start here
        System.out.println("\n\ndouble examples start here:");

        double d1=1.123456789;
        double d2=2.123456789;
        double d3=3.123456789;
        double d4=10.123456789;
        double d5=8.22312346789;

        System.out.print(d5*d5);
        System.out.print(" ");
        System.out.print(d1+d2);
        System.out.print(" ");
        System.out.print(d1*d5);


    }

}