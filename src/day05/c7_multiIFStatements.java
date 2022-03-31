package day05;

public class c7_multiIFStatements {

    public static void main(String[]args){

        //check 2 numbers
        //first check if they are equal
        //then check if one of them is bigger
        //last condion is smaller

        //you will prefer to use multi if you have more then 2 conditions

        int x=35;
        int y=35;

        if(x==y){
            System.out.println(x +" is equal to " +y);
        }else if(x>y){
            System.out.println(x +" is bigger than " +y);
        }else {
            System.out.println(x+" is smaller than " +y);
        }


    }
}
