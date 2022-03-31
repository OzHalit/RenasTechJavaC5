package day05;

public class c3_minNumber {

    public static void main(String []args){

        // 3 different variable
        // x=400 y=200 z=300  //output should be minimum number is 200
        //x=100 y=200 z=300  //minimum should be 100
        // x=300 y=100 z=400  //minimum should be 100

        //if x is the minimum number that means x<y and x<z
        //how do we know if y is the minimum number?
            //that means y<x and y<z

        int x=200;
        int y=1000;
        int z=1500;

        boolean xMin=x<y &&x<z;
        boolean yMin=y<x && y<z;
        boolean zMin=z<x && z<y;

        System.out.println(zMin);

        if (xMin){
            System.out.println("Minimum number is "+x);
        }
if (yMin){
    System.out.println("Minimum number is "+y);

}
if (zMin){
    System.out.println("Minimum number is " +z);
}






    }
}
