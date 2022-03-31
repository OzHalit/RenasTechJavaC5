package day07;

import java.util.Scanner;

public class c4_Scanner {

    public static void main(String[] args) {

//scanner is a library under java
        //this library has ready methods that you can use it
        //to be able to use this library we need to call them in our class
        //and create object from that library

        Scanner input=new Scanner(System.in);
        //I called scanner class(ready libary under java) and we created an object called "input"
        //fropm Scanner class

        System.out.println("insert your byte number");
        byte b1=input.nextByte();
        System.out.println(b1);

        System.out.println("Enter int number");
        int number=input.nextInt();
        System.out.println("Int number: "+number);

        Scanner scan=new Scanner(System.in);
        //this is another object we created it comes from scanner class
        //object name is: scan
        System.out.println("insert your short number");
        short number2=scan.nextShort();
        System.out.println("Short number: " +number2);



    }
}
