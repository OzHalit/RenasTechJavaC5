package day05;

public class c5_negativePositive {

    public static void main(String[]args){

        //create a java program that will check the given number =20
        //if number is positive print : 20 is positive
        //if number is negative print : 20 is negative
        //if number is zero print: 20 is zero

        int x=20;

        boolean xisPos=(20 > 0);
        boolean xisNeg=(20 < 0);
        boolean xisZero=(20==0);


        if(xisPos){
            System.out.println(x +" is positive");
            if(xisNeg){
                System.out.println(x +" is negative");
                if(xisZero){
                    System.out.println(x +"is zero");

                }
            }
        }



    }
}
