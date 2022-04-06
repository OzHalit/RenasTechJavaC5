package homeworkday14;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            System.out.println("enter #:");
            int n1= input.nextInt();
            System.out.println("enter second #:");
            int n2= input.nextInt();
            System.out.println("You want to Substract(-), Add(+), Divide(/) or Multiply(*):");
            char ch=input.next().charAt(0);
            String result;
            int n3=0;
            switch (ch){
                case '+':n3=n1+n2;
                    result=n1+"+"+n2+"="+n3;
                    break;
                case '-':n3=n1-n2;
                    result=n1+"-"+n2+"="+n3;
                    break;
                case '/':n3=n1/n2;
                    result=n1+"/"+n2+"="+n3;
                    break;
                case '*':n3=n1*n2;
                    result=n1+"*"+n2+"="+n3;
                    break;
                default:result="oopsie";
            }
            System.out.println(result);


    }
}
