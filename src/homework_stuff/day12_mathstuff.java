package homework_stuff;

public class day12_mathstuff {

    public static void main(String[] args) {
        System.out.println("These are the odd numbers divisible by 3&5:");
        for (int number=1 ; number<=100; number++) {

    if ((number%2!=0) && (number%3==0) && (number%5==0)){
                System.out.println(number);
            }
            }
        System.out.println("These are the even numbers divisible by 3&5:");
        for (int number=1 ; number<=100; number++) {

            if ((number%2==0) && (number%3==0) && (number%5==0)){

                System.out.println(number);
            }
        }
        }
    }

