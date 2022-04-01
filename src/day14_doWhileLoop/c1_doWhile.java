package day14_doWhileLoop;

public class c1_doWhile {
    public static void main(String[] args) {
        //for loop
        //while loop
                //-->will run as long as condition is met
                //it will stop running once your condition turns to false

        //dowhile
        //do part will run no matter what the condition is
        //while will run if it's true

        int number=10;

        while (number<10) {//since condition is false it wont print anything fromt he body of while loop
            System.out.println("While Loop");

        }

        do {//do while run at least one time no matter condition is true or false
            System.out.println("do while");
        }while (number<10);  //false

        do {
            System.out.println("hello");
        }while (number<10);  //10==10 is true inifinitive loop
        int number2=3;

        do {
            System.out.println("number2 = " + number2);
            number2++;
        }while (number2<10);
        System.out.println("******************************************************************************");


int count=0;
        int number4=0;
        do{
            if(number4%2==0) {
                count++;

                System.out.print(number4 + " , ");
            }
            number4++;


            }while (number4<=100);{
            System.out.println();
            System.out.println(count);
            System.out.println("**************************************************");


        }




        }


}

