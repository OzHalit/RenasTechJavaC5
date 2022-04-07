package day17;

import java.util.Arrays;

public class c2_string_methods {
    public static void main(String[] args) {

        //learning toCharArray


        String str="Hello world java is fun 12312";

        char[]letters=str.toCharArray();
        System.out.println(Arrays.toString(letters));
        System.out.println(letters[3]);

        //string method
        //split()
        //this will split given string from specific condision in the string, will return as String
        System.out.println("***************************");

        String myString="Java is very fun hello world";
        String [] splittedSentence=myString.split(" "); //this will split the string from each space
        System.out.println(Arrays.toString(splittedSentence));
        System.out.println("splittedSentence[1] = "+splittedSentence[1]);
        System.out.println("***********************************************");

        String[] splittedSentence2=myString.split("a");
        System.out.println(Arrays.toString(splittedSentence2));

String[] split3=myString.split("");
        System.out.println(Arrays.toString(split3));






    }
}
