package day06;

public class c1_multiifStatement {
    public static void main(String[] args) {

        //starting point is 0  //print your starting point
        //ending point is 10   //print your ending point
        //between those numbers (0-10) will be on my way   //print you are on your way
        //anything left will be wrong way  //print some warning messages

        int x=0;
        int y=10;
        int point=0;

        if(point==0){
            System.out.println("This is the starting point");
        }else if(point==10){
            System.out.println("You are at the ending point.");
        }else if(point >0 && point <10){
            System.out.println("You are on the way");
        }else{
            System.out.println("You are going the wrong way buddy...LOL \n Check your point.");
        }




    }
}
