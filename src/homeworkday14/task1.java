package homeworkday14;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your 1st #: ");
        int n1=input.nextInt();
        System.out.println("Enter your 2nd #: ");
        int n2= input.nextInt();
        System.out.println("Result of your Quotient is: "+(n1/n2));
        System.out.println("Result of your remainder: "+(n1%n2));
    }
}
