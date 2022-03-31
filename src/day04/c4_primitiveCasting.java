package day04;

public class c4_primitiveCasting {
    public static void main(String[]args){

        //implicit casting done auto via java
        //explicit casting needs to be handled manually

        //double > float > long> int > short > byte

        byte number1=20; //-128 to 127
        long number2=number1;

        System.out.println(number2);

        int i1=10;
        byte b1= (byte) i1;

        System.out.println(b1);


    }
}
