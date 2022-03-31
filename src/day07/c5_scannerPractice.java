package day07;

import java.util.Scanner;

public class c5_scannerPractice {

    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        //we just input scanner class aka the library to our class
        //we will be able to use all methods from scanner by calling user input object

        System.out.println("Insert first number bro: ");

//        int num1=10;
//        int num2=20;
//        int num3=30;
        int number1=userInput.nextInt(); //asking the user to enter number from console

        System.out.println("You have inserted number: "+number1);

        if(number1 %2 ==0){
            System.out.println(number1 +" is an even number.");
        }else{
            System.out.println(number1+" is not an even number.");
        }



    }
}
