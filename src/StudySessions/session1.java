package StudySessions;

import java.util.Arrays;

public class session1 {
    public static void main(String[] args) {

        int[] arr = {23, 25, 26, 32, 42, 51, 99, 2};

        for (int i = 0; i < arr.length; i++) {            //this logic to loop int array

            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println();
        System.out.println("**************************************");

        int[] list1 = {2, 3, 5, 6, 56, 8, 53};
        int startingpoint = 0;
        int endingpoint = list1.length - 1;

        int sumofoddnumbers=0;

        while(startingpoint<=endingpoint){  //we will loop list1 Array with while loop
            //we will decide which number is odd number

            if(list1[startingpoint]%2!=0){
                sumofoddnumbers=sumofoddnumbers+list1[startingpoint];

            }
            startingpoint++;
        }
        System.out.println("sum of odd #'s = "+sumofoddnumbers);

        System.out.println("*********************************************");


//Create a java program that will print how many times java is written in the given String array=.  String [] name={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"}

        String [] names={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"};

        int count=0;  //step 1 - create your variable storage

        for (int i = 0; i <= names.length-1; i++) {

            System.out.print(names[i]+" ");

            if (names[i].equalsIgnoreCase("java")){
                count++;
            }

        }
        System.out.println();
        System.out.println("Total # of times java is repeated in string is: "+count);

        System.out.println("**************************************************");

//create a java program that will print numbers from biggest to smallest number.

        int[] numbers={2,90,4,-99,99,73};
        int[] newarray=new int[numbers.length];  //we will use this int array to store our number

        System.out.println("numbers.length= "+numbers.length);
        System.out.println("new array lenght= "+newarray.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
int temp=0;
        for (int i = numbers.length-1; i>=0; i--) {
            newarray[temp]=numbers[i];
            temp++;
        }

        System.out.println(Arrays.toString(newarray));

    }
}
