package day06;

public class c3_evenOdd {

    //create a java program that will check if number is even or odd

    public static void main(String[] args) {

        int number=25;
        boolean evennumber=(number % 2 == 0);

        if(evennumber){
            System.out.println(number +" is an even number.");
        }else{
            System.out.println(number +" is NOT an even number");
        }

        //try with ternary

 String result=(number % 2==0) ? number + "\tis even number" : number +"\tis odd number";


        System.out.println(result);


    }
}
