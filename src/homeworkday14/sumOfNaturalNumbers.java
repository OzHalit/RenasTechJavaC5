package homeworkday14;

import java.util.Scanner;

public class sumOfNaturalNumbers {
    public static void main(String[] args) {

//Create a Java Program to Calculate the Sum of Natural Numbers
        //natural number are 1 through infinity does not include 0

        Scanner input=new Scanner(System.in);
        System.out.println("Enter natural number: ");
        int n1=input.nextInt();
int sum=n1;

        for (int i = 1; i < n1; i++) {
            sum*=i;

        }
        System.out.println("factorial number is: "+sum);

        System.out.println("*********************************************");

        //Create a Java Program to Find Factorial of a Number






    }
}
