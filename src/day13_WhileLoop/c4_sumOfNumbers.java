package day13_WhileLoop;

import java.util.Scanner;

public class c4_sumOfNumbers {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number= input.nextInt();

        int start=0;
        int sum=0;

        while (start<= number) {
            System.out.println("Sum is in the while loop: "+sum);
            sum += start;
            System.out.println("Sum is after sum: "+sum);
            start++;

        }
        System.out.print("Sum= "+sum);



    }
}
