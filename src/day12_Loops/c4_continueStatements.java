package day12_Loops;

public class c4_continueStatements {

    public static void main(String[] args) {

        for (int i=0; i<5; i++){
            System.out.println("Before break");

            if (i==2){
                break;  //when java reaches break, it stops loop

            }
            System.out.println("After if ");
        }

        //print only even numbers from 1-10
        //first way to look is using if i%2==0 than print i
        //continue statement which will skip odd numbers

        for (int i=1; i<=10; i++){

            if (i%2==0){
                System.out.println(i);
            }
        }

        System.out.println("*******************************");

        //continue statement

        for (int i=1; i<=10; i++){

            if (i%2!=0) { //odd numbers != makes it opposite than even
                continue;
            }
                System.out.println(i);
            }
        System.out.println("+++++++++++++++++++");

        for (int i=1; i<=10; i++){

            if (i%2==0) { //will print opposite of even numbers
                continue;
            }
            System.out.println(i);
        }
        System.out.println("************************lineee breakkk*********************************************");












        }




    }

