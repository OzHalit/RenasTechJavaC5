package day06;

import javax.xml.bind.SchemaOutputResolver;

public class c2_ternary {

    public static void main(String[] args) {

        //ternary is just another way of using if else block
        //create a java program that prints max number between 2 numbers

        //if represents ?
        // : represents else

        int number1=10;
        int number2=20;
        int max=0;  //will be used to store max number

        String message="";

        System.out.println(max);
        System.out.println(message);

        if(number1 > number2){
            max=number1;
                    }else{
            max=number2;
        }

        message="Maximum number is : " +max;
        System.out.println(message);

//ternary is another way of if else block

        int number3=10;
        int number4=20;
        int max2;

        max2= (number3 > number4 ? number3 : number4);
        System.out.println(max2);

String result="";
result=(false) ? "Java" : "Phyton" ;

        System.out.println(result);

    }
}
