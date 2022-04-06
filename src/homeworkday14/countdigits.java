package homeworkday14;

import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {

        //Create a Java Program to Count Number of Digits in an Integer

        Scanner value=new Scanner(System.in);
        System.out.println("Enter a number to count digit amounts: ");
        int number= value.nextInt();
        int count=0;

        do{number=number/10;
            count++;}
        while(number!=0);
        System.out.println("Digits inputted are: "+count);

//Create a Java Program to Reverse a Number



    }
}
