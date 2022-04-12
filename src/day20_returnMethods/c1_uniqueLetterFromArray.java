package day20_returnMethods;

public class c1_uniqueLetterFromArray {
    public static void main(String[] args) {

        //write program that can print out unique values from a string array

        //ex if arr -->  {"a", "a", "b", "c", "c"
        //output: b

        String[] letters = {"A", "A", "B", "C", "C", "C", "D", "D", "E"};

        for (String eachletter : letters) { //get the letters
            int count = 0;
            for (String eachletter2 : letters) {
                if (eachletter2.equals(eachletter)) {
                    count++;

                }


            }
            if (count == 1) {
                System.out.println(eachletter + " is unique.");
            }
        }
        System.out.println("*****************************");

        String [] arr={"A","B","C","D","E"};









        }













    }}
