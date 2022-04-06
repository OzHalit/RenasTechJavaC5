package day16_arrays_day2;

import java.util.Arrays;

public class c1_array1 {
    public static void main(String[] args) {

        //find the sum of the numbers from int array

        int [] numbers={4,-90,200,5};  //find the max & min & sum

        int sumOfTheArray=0;  //assigning a variable to store the answer
        int lastIndex=numbers.length-1;

        for (int i = 0; i <numbers.length; i++) {

            sumOfTheArray+=numbers[i];
        }

        System.out.println("Sum of the Array is: "+sumOfTheArray);

        //array size part;

        int[] ages=new int[5];
        //lenght is 5
        ages[2]=50;
        System.out.println("pulling ages 2 from arrays: "+ages[2]);
        System.out.println("If you don't assign array index a number it will be equal to 0 :"+ages[3]);

boolean[] foundJob=new boolean[3];

        System.out.println(foundJob[0]);  //false because index 0 has no assignment
        System.out.println(foundJob[1]);

        foundJob[0]=true;
        System.out.println("foundJob[0] = "+foundJob[0]);  //we just updated the value to true so it will print "true"

        //Array utilities

        //array is a java library which has some methods


        System.out.println("********************************************");
        String[] futureSdets={"Libby","Gulsum","Gule","Aslihan","Suleyman","Abe"};
        Arrays.toString(futureSdets);                                //convert arrays to string so we don't deal with for method
        System.out.println(Arrays.toString(futureSdets));    //use Arrays.toString  and it will print the list

        int[]numList={0,0,78,900};
        Arrays.toString(numList);
        System.out.println(Arrays.toString(numList));






    }

}
