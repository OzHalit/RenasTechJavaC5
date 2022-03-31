package day04;

public class c5_logicalOperators {

    public static void main(String[]args){

        //-->&& = and
        //-->|| = or
         //--> ! = not

    System.out.println((4>2) && (2>4) );  //true & false - if there is a false statement then the result is false.
    System.out.println( (10<=5) && (0==0) ); //false & true
    System.out.println( (1>=2) && (2!=2) );  //false & false
        System.out.println( (10>=10) && (10<=10)); //true & true

// Or examples - java will always choose the true statement even if there's a false statement in it because of the || command
        System.out.println((4>2) || (2>4) );
        System.out.println( (10<=5) || (0==0) );
        System.out.println( (1>=2) || (2!=2) );
        System.out.println( (10>=10) || (10<=10));

        // ! -- not command examples

        boolean bool1=true;
        boolean bool2=!(10 !=15);

        System.out.println(bool2);

        boolean b3=!!!!!!bool1;
        boolean b4=!(15>=15);

        System.out.println( (b3||b4) && true);
        System.out.println(("maryam" == "abe") || ("murat" == "murAt"));


    }

}
