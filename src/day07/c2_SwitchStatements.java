package day07;

public class c2_SwitchStatements {
    //create java program that will take numbers between 1-12
    //and print months name depends on number
    //ex
    //1 -- jan
    //5 -- may

    public static void main(String[] args) {
        int number=12;
        String monthName;
        switch(number){
            case 1:monthName="January";
            break;
            case 2:monthName="February";
            break;
            case 3:monthName="March";
            break;
            case 4:monthName="April";
                break;
            case 5:monthName="May";
                break;
            case 6:monthName="June";
                break;
            case 7:monthName="July";
                break;
            case 8:monthName="August";
                break;
            case 9:monthName="September";
                break;
            case 10:monthName="October";
                break;
            case 11:monthName="November";
                break;
            case 12:monthName="December";
                break;
            default:monthName="Invalid number";

        }
        System.out.println(monthName);
    }

}
