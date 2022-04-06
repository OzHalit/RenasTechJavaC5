package homeworkday14;

import java.util.Scanner;

public class positive_or_negative {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your # to check if positive or negative:");
        int number= input.nextInt();
        if (number>0){
            System.out.println(number+" is a positive number.");
        }else{
            System.out.println(number+" is a negative number.");
        }
        System.out.println("*******************************************************************");






    }
}
