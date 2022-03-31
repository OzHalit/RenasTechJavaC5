package day05;

public class c6_ifElseStatements {

    public static void main(String []args){

        // 2 numbers
        // if two numbers are equal print " numbers are equal
        // it is not print : numbers are not equal

        int number1=20;
        int number2=10;

        if(number1==number2){
            System.out.println(number1 + "  Equal " +number2);
        }

        if(number1!=number2){
            System.out.println(number1 + "  Not Equal " +number2);
        }

        if(number1==number2) {
            System.out.println(number1 + "  Equal " + number2);
        }else{
            System.out.println(number1 + "  Does Not Equal " +number2);
        }

        //check if numbers are even or odd

        int number=320;

if(number % 2 ==0){
    System.out.println(number +" is an even number");
}else{
    System.out.println(number +" is NOT an even number");

}


    }
}
