package homeworkday14;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the year you want to check for leap year:");
        int year= scanner.nextInt();

        if (year%400==0 || year%4==0 && year%100!=0){
            System.out.println(year+" is a leap year.;");
        }else{
            System.out.println(year+" is not a leap year.");
        }



    }
}
