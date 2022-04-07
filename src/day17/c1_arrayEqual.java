package day17;

import java.util.Arrays;

public class c1_arrayEqual {
    public static void main(String[] args) {
        int[] arr1={3,5,7};
        int[] arr2={5,3,7};
        int[] arr3={3,5,7};
        int[] arr4={3,4,7};

//arrays equal

        boolean b1= Arrays.equals(arr1,arr2);
        System.out.println(b1);
        boolean b2= Arrays.equals(arr1,arr3);
        System.out.println(b2);









    }
}
