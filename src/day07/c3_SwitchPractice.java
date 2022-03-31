package day07;

public class c3_SwitchPractice {

    public static void main(String[] args) {

        //3 cases with a b c
        //if case is 1, result should be Hello a
        //b should be Hello b
        //c should be Hello c
        //if letter is something else Hello invalid

        char letter='c';
        String result="Hello  ";

        switch (letter){
            case 'a' :
                result+="a";
                break;
            case 'b' :
                result+="b";
                break;
            case 'c':
                result+="c";
                break;
            default:
                result+="Invalid";

        }
        System.out.println(result);

        //in switch first it will check matching case
        //and then it will execute all the lines after matching cases if there is no break
        //if there is break it will only execute same line and then break rest of it

    }
}
