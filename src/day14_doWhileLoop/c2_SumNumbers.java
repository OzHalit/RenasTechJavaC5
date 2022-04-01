package day14_doWhileLoop;

import java.util.Scanner;

public class c2_SumNumbers {
    public static void main(String[] args) {

        //task
        //write do while loop that asks the user to enter two numbers
        //the numbers should be added and displayed
        //the loop should ask the user whether he or she wishes to perform the operation again
        //if so, the loop should repeat; otherwise it should terminate
        //if user says y or Y continue
        //if user says n or N stop the loop

        Scanner input=new Scanner(System.in);
        char choice; // y or n
        int number1 , number2;

        do {
            System.out.println("First number here bro: ");
            number1 = input.nextInt();
            System.out.println("Alright bro, now enter 2nd Number: ");
            number2 = input.nextInt();

            //the number should be addded and the sum displayed.

            int sum=number1+number2;
            System.out.println("Bro, here's the sum of the numbers "+number1 +" & " +number2 +" which is: " +sum);
            System.out.println("Do you want to continue this addition opperation? type y or n");
            choice=input.next().charAt(0);



        }while (choice=='y' || choice=='Y');




    }
}
