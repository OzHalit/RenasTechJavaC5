package day07;

import java.util.Scanner;

public class c7_ScannerNext {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName=input.next();
        System.out.println("First name is: " +firstName);

        System.out.println("Enter Last Name: ");
        String lastName=input.next();
        System.out.println("Last Name is: " +lastName);
        System.out.println("Full Name is: "+firstName + " " +lastName);
        System.out.println("Enter your grade: ");

        int grade=input.nextInt();
        System.out.println("Your name and grade: "+firstName +" "+lastName +"\n Grade: " +grade);

    }
}
