package day12_Loops;

import java.util.Scanner;

public class c1_reverseString {
    public static void main(String[] args) {

        //how can you reverse a string
        //input hello
        //output olleh

        //input Java
        //output avaJ

        //basically printing from last index to first index.

        String word="Hello";
        String reverseString=""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println("reverseString= "+reverseString);

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word2=input.next();
        int lastIndex=word2.length()-1;
        String reverseWord2=""; //i need to store word2 from last index to first index

        //last index == lentgh -1
        //first index 0
        //i need to go from last to first one by one
        //iteration -1



        for (int i=lastIndex ; i>=0; i--) {
            System.out.println("i = " +i);
        System.out.println("word2.charAt(i)= " +reverseWord2);
            reverseWord2 += word2.charAt(i);
            System.out.println("After adding charAt reverseWord2= "+reverseWord2);
        }

        System.out.println(reverseWord2);






    }
}
