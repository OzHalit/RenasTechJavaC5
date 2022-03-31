package day12_Loops;

public class c3_breakStatementClause {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("java");


            if (i == 4) {
                System.out.println("Java2");
            }

        }

        System.out.println("****************************************");
        //break statement
        //anytime java reaches to break statement it will stop current loop

        for (int i = 1; i <= 5; i++) {
            System.out.println("hello");

            if (i == 3) {//3
                System.out.println("Stop hello");
                break;
            }
            System.out.println("hello 2");
        }
        System.out.println("hello again motha fuckers");



    }

}
