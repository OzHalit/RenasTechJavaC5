package homework_stuff;

import java.util.Locale;

public class day12_uppercaselowercase {
    public static void main(String[] args) {

String city="Philadelphia";

        System.out.println("My string is my city: "+city);
int length=city.length();
        System.out.println("This is how many characters my string has: "+length);

        if (length%2==0){
            String city2=city.substring(5,7).toUpperCase();
            System.out.println("These are the middle characters in CAPS: "+city2);
        }









    }



}
