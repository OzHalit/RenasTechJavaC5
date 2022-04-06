package homeworkday14;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter you want to check for vowel/constonent: ");
        char value = input.next().charAt(0);

        if (value=='a' || value=='e' || value=='i' || value=='u' || value=='o'){
            System.out.println(value + " is a vowel");
    }else{
        System.out.println(value+" is a Consonant.");


    }


    }}
