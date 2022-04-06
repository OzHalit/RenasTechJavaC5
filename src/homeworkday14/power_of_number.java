package homeworkday14;

import java.util.Scanner;

public class power_of_number {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the # to find power to it: ");
        long number= input.nextLong();
        long result=1;
        long powerOfNumber=1;

        do {result=number*result; powerOfNumber++;}
        while (powerOfNumber<=number);
        System.out.println(result);



    }
}
