package day03;

public class c2_booleanChar {
    public static void main(String []args){
       //boolean 1bit stores true or false values
       //char 2bytes Stores single character/letter or ASCII values "a"

       //dataType variablenames=data
       boolean b1=true;
       boolean b2=false;

       boolean b3=10>15;
       boolean b4=50<100;

       System.out.println(b3);
       System.out.println(b4);

       char ch1='a'; //char will only store single letter or number from ASCII table
        System.out.println(ch1);

        //mroe practice examples
        // == means equal
        // !=means not equal
        boolean booli=25==30;
        boolean booli2=20 !=21;

        System.out.println(booli);
        System.out.println(booli2);
        //! will change yoru values as a opposite one
        //for example !true will mean "false"
        System.out.println(true==false);
        System.out.println(!true==false);
        System.out.println(!true != !false);

        System.out.println(!(true ==false));  //<--on this example true does not = false but the ! makes it opposite so it will print "true"
        System.out.println(!(true == true) == ( false == !true) );

        //char examples

        char c1='a';
        char c2='2';
        char c3='@';
        char space='A';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(space);

        int i=97;
        char char1=97;

        System.out.println(i);
        System.out.println(ch1);

        System.out.println(i+char1);



    }
}
