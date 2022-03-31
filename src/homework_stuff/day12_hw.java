package homework_stuff;

import java.util.Scanner;

public class day12_hw {

    public static void main(String[] args) {

        //Write a program that prompts the user to input an integer and then outputs the number with digits reversed.


        Scanner input = new Scanner(System.in);
        System.out.println("Please input numbers to be reversed: ");
        String digits = input.next();
        int lastIndex = digits.length() - 1;
        String reversedDigits = "";

        for ( int i = lastIndex; i >= 0; i-- ){
            System.out.println("You inputted this number: " + digits);
            reversedDigits += digits.charAt(i);
            System.out.println("Your numbers in reversed are:  " + reversedDigits);
        }


    }
    }

