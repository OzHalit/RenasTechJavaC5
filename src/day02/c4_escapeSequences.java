package day02;

public class c4_escapeSequences {

    //    escape sequences:
//   \t: paragraph space
//  \n: new line
//  \": prints double quote " on the console
//  \\: prints \ on the console
//  \': prints single quote
//   ' : prints single quote


    public static void main(String[]args) {

        System.out.println("Renastech");

        // |t: paragraph space
        System.out.println("\tRenastech");
        System.out.println("\nwill this be a new line?");
        System.out.println();

        /*
        -->This is how we will use the \n sequence instead of println to break the lines.
         */

        System.out.println("Name: Halit \nID: 12546 \nDiamond Apes, Inc \nSalary: Bunch of \"Bananas\"/Daily");

    }

}
