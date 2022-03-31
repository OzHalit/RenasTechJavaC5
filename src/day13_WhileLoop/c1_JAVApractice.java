package day13_WhileLoop;

public class c1_JAVApractice {

    public static void main(String[] args) {

        String result = "";
        int a = 6;

        int count2and3 = 0;
        for (int i = 1; i <= 1000; i++) {

            //let's get the count of numbers that are divisible by 2&3 at the same time


            if (i % 2 == 0 && i % 3 == 0) {
                result += "JAVA ";
                count2and3++;
            } else if (i % 3 == 0) {
                result += "VA ";
            } else if
            (i % 2 == 0) {
                result += "JA ";
            } else {
                result += i + " ";

            }

        }
        System.out.println("Result is: " + result);
        System.out.println("total JAVA count is: "+count2and3);
    }
}


