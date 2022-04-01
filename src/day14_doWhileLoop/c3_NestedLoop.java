package day14_doWhileLoop;

public class c3_NestedLoop {
    public static void main(String[] args) {

        //nested if - if inside another if
        //nested loop - loop inside another loop


        for (int i = 0; i < 3; i++) {
            System.out.println("Java");

            for (int j = 1; j < 5; j++) {
                System.out.println("Child Loop");

            }

        }
        System.out.println("*********************************");

        for (int i = 1; i < 4; i++) {
            System.out.println("Parent loop start point");
            for (int k = 3; k < 6; k++) {

                System.out.println("child loop is running i is "+i+" k is "+k);

            }
            System.out.println("parent loop end");


        }

        System.out.println("***********************************************");

        int totalRow2=5;
        int totalColumn2=30;

        for (int i = 0; i < totalRow2; i++) {
            int j=1;
            while (j<=totalColumn2){
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }

        System.out.println("we will attempt to print US Banner");

        for (int i = 1; i < 5; i++) {
            System.out.print("**********");
            System.out.print("================================");
            System.out.println();

        }
        for (int k = 1; k < 4; k++) {


            System.out.println("==========================================");
        }


    }}
