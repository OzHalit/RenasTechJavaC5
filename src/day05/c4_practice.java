package day05;

public class c4_practice {

    public static void main(String[]args){

        int number1=25;
        int number2=39;

        //write a java program to have the following output
        //25 != 39
        //25 <39
        // 25<=39

        boolean boo1=(number1!=number2);
        boolean boo2=(number1<number2);
        boolean boo3=(number1 <=number2);

        if(boo1){
            System.out.println(number1 +" does not equal " +number2);
        }
if (boo2){
    System.out.println(number1 +" is less then " +number2);

}
if (boo3){
    System.out.println(number1 +" is smaller or equal to " +number2);
}

if(25!=39){
    System.out.println("Does not equal: "+true);

}
if(25<39){
    System.out.println(true);

}
if(25<=39){
    System.out.println(true);
}

if(number1==number2){
    System.out.println(number1 + "== "+number2);}
if(number1 < number2){
    System.out.println(number1 +" is less then " +number2);
}
if(number1!=number2){
    System.out.println(number1 +" does not equal " +number2);
}

    }
}
