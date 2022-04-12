package day17;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;

public class c4_multipledimensionarrays {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        System.out.println("arr ID: "+arr.length);

        int[][]arr2={{1,2,3,},{0,2,4,},{2,4}};
        //container idnexes  -- 3 containers here, 0, 1, 2
        //indexes for each number

        System.out.println("arr 2dimension: "+arr2.length);  //result wil be 3 because there's 3 containers
        System.out.println("arr third container index: "+arr2[2].length);  //result will be 2 because it will pull index of third container

        //arr [][]
        //frist bracket is always container number
        //second one is index of variable
        System.out.println("this will print container 1, index 2: "+arr2[1][2]);
        System.out.println("this will print 30: "+arr2[0][2]);

        System.out.println("***********************");

        //if you want to print from specific containers, this is what to do:
        System.out.println(Arrays.toString(arr2[1]));



    }
}
