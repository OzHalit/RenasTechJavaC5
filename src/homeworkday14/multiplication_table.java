package homeworkday14;

import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {

        //Create a Java Program to Generate Multiplication Table

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number to find out the x table: ");
        int number= scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println(number+" x "+i+" = "+(number*i));

        }

    }
}
