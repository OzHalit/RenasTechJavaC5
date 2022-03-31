package day06;

public class c4_ternaryContinue {

    public static void main(String[] args) {

        //if else if else if else with ternary

        //this task:
        //create a java program that takes score of student and prints the grade of student
        //between 100 to 85 is grade A
        //70-84 is B
        //60-69 is C
        //40-59 is D
        //0-39 is F
        //if number is nto between 0-100 grade is 0,, invalid number

        int number1=0;
        int number2=100;
        int score=85;
        char grade='0';

        String message="Your grade is: ";

        if(score>=85 && score<=100){
            System.out.println(message +"A");
        } else if(score>=70 && score<=84){
            System.out.println(message + "B");
        }else if(score>=60 && score<=69){
            System.out.println(message + "C");
        }else if(score>=40 && score<=59){
            System.out.println(message + "D");
        }else if(score>=0 && score<=39){
            System.out.println(message + "F");
        }else{
            System.out.println("Invalid Number");
        }

        //ternary example



       char grade2=(score >= 85 && score <= 100)? 'A' :(score >= 70 && score <= 84)? 'B'
                            :(score >= 60 && score <70)? 'C' :(score >= 40 && score <60)? 'D'
               :(score >= 0 && score <= 40)? 'F' : '0';


        String message2="Student grade is : " +grade2;
        System.out.println(message2);




    }
}
