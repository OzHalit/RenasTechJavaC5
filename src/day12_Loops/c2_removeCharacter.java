package day12_Loops;

import java.awt.peer.SystemTrayPeer;
import java.util.Scanner;

public class c2_removeCharacter {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word=scan.next();
        System.out.println("The word is: "+word);

        //need to lopok at first and last index
        //first index = 0
        //last index = lenght-1

        //first we are checking first letter if it's small or capital a/A

        if (word.substring(0,1).equalsIgnoreCase("a")){
            word=word.substring(1);
        }
        System.out.println("New word if there is an a: " +word);

        //check last idnex to see if letter is equal to a or A
        //if yes remove it

        int length=word.length();
        int lastIndex=length -1;

        if (word.substring(lastIndex).equalsIgnoreCase("A")){

            word=word.substring(0, lastIndex); //last index is not included

        }
        System.out.println("New word if ends with A: "+word);





    }
}
