package day02;

public class c5_Variables {
    //---> something about premitive variables or sumshit

    //        Primitive Data Types
//        A primitive data type specifies the size and type of variable values, and it has no additional methods.
//
//                There are eight primitive data types in Java:
//
//        Data Type            Size           Description
//        byte             1 byte         Stores whole numbers from -128 to 127
//        short             2 bytes            Stores whole numbers from -32,768 to 32,767
//        int              4 bytes            Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long             8 bytes            Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


//        float                4 bytes            Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double           8 bytes            Stores fractional numbers. Sufficient for storing 15 decimal digits

//        boolean          1 bit          Stores true or false values
//        char             2 bytes            Stores a single character/letter or ASCII values   'a'
//
//primitive data types: byte, short, int, long, float, double, char, boolean
//
//        for numbers: byte, short, int, long, float, double
//
//        whole number: byte, short, int, long
//
//        decimal number: float, double
//
//        range:
//        double > float > long > int > short > byte
//
//        larger one cannot be assigned to smaller one
//        smaller one can be assigned to larger one
//
//
//        As a default java picks int for whole number
//        As a default java picks double for decimal number
//
//        Non primitive types: String, Object
//        There are also reference types that wrap the primitive types.
//        These can be useful if you need a make a variable null or use it in a class that requires a non-primitive type
//
//        Non primitives are usually objects that we create (the exception being String)

    public static void main(String[]args){

        //        Primitive Data Types
//        A primitive data type specifies the size and type of variable values, and it has no additional methods.
//
//                There are eight primitive data types in Java:
//
//        Data Type            Size           Description
//        byte             1 byte         Stores whole numbers from -128 to 127
//        short             2 bytes            Stores whole numbers from -32,768 to 32,767
//        int              4 bytes            Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long             8 bytes            Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

//        for numbers: byte, short, int, long, float, double
//
//        whole number: byte, short, int, long
//
//        decimal number: float, double
//
//        range:
//        double > float > long > int > short > byte

        byte number1=125;
        byte number2=-23;
        double number3=5.5;

        System.out.println(number2);

        System.out.println(number3);

        System.out.println(number2 + number3);

        //short 2 bytes - stores whole numbers from -32,768 to 32,767

        short s1=128;
        short s2=25;
        short s3=20000;

        System.out.println(s1 * s2 );
        System.out.println("I multiplied s1 and s2?  wwwhhhaaatTT?");

        // int - 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647

        int intnumber=123123;
                System.out.println(intnumber);

    long long1=2000;
    long long2=2000000000; //when you move out from int range compiler needs to know what is this number
                            //that's why we paste L at the end to tell hava this is a long number
        System.out.println(long1);
        System.out.println(long2);

    }


}
