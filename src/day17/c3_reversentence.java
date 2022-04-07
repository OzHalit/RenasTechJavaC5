package day17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c3_reversentence {
    public static void main(String[] args) {

////create a condition that will reverse given sentence
        //        //ex: Java is fun
        //        //output should be fun is java
////create a condition that will reverse given string
        //        //ex: Java is fun
        //output should be nuf si avaJ

        String str = "Java is fun";
        String[] splittedstr = str.split(" ");
        System.out.println(Arrays.toString(splittedstr));
        System.out.println("Now reverse it: ");

        for (int i = splittedstr.length-1; i >= 0; i--) {
            System.out.print(splittedstr[i]+" ");

        }

        System.out.println();
        System.out.println("***********************");

        char[]backwardsstr=str.toCharArray();
        System.out.println(Arrays.toString(backwardsstr));
        System.out.println("Now reverse it: ");

        for (int i = backwardsstr.length-1; i>=0 ; i--) {
            System.out.print(backwardsstr[i]);

        }

    }


   }

