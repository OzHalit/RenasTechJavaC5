package day16_arrays_day2;

import java.util.Arrays;

public class c2_Arrays {
    public static void main(String[] args) {


        int[] numlist={0,0,78,900};
        int[] list1={1,0,5};
        int[] list2={-90,78,100};

        int[] list3=new int[list1.length + list2.length];
        System.out.println(Arrays.toString(list3));

        for (int i = 0; i < list1.length; i++) {

list3[i]=list1[i];

            System.out.println(Arrays.toString(list3));


        }



    }

}
