package day13_WhileLoop;

import java.util.Scanner;

public class c5_sumofevenNumbers {

    public static void main(String[] args) {

        int sum=0;


        for (int i = 0; i <=30 ; i++) {
            if (i%2==0){
                System.out.println("adding "+i+" to sum");
                                sum+=i;


            }
            System.out.println("Sum is actually: "+sum);
        }

        System.out.println("**************************************************");
        int start=0;
        int sum2=0;
        while (start<=30);
        if (start%2==0){
            System.out.println("Adding "+start+" to sum");
            sum2+=start;}
            start++;
        }

        System.out.println("New Sum: "+sum2);
    }
}
