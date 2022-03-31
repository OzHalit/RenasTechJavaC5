package homework_stuff;

import java.awt.*;
import java.util.Scanner;

public class scanner_homework {
    public static void main(String[] args) {

        System.out.println("Please enter your first word: ");
        Scanner input=new Scanner(System.in);
        String word= input.next();
        System.out.println("Your first word is: "+word+" | Now please enter your second word: ");
        String word2= input.next();
        System.out.println("Your first word is: "+word+" and second word is: "+word2+".");

if (word.charAt(word.length()-1) == word2.charAt(0)){

            System.out.println("last letters are matching");
//create new words


    System.out.println(word+word2.substring(1));



}







    }

}