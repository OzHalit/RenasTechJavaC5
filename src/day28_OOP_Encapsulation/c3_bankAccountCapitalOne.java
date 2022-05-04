package day28_OOP_Encapsulation;

public class c3_bankAccountCapitalOne {

    //create custom class called BankAccountCapitalOne for cap1 bank accounts
    //names, account info,,,,balance etc,

    public static String bankName="Capital One"; //static public
    public String firstName;
    public String lastName;
    private String accountHolder;
    private long accountNumber;
    private double balance;

    //create a constructor that initialize firstname and lastname
    //constructor: access modifier + class name
    public c3_bankAccountCapitalOne(String firstName , String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        //first + last
        this.accountHolder=firstName + " " + lastName;
    }
    //encapsulating privte data

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance){
        this.balance=balance;
            }

            public String getAccountHolder(){
        return accountHolder;
            }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money){ //balance + new money
        setBalance(balance+money);

    }

    public void withdraw(double money){
        setBalance(balance-money);
    }

    //actions: depositing, withdrwaing, availableBalance & toString: returns the full name and balance

    //set toString will help us define what object means for the class

    public String toString(){
        return " Full name is "+getAccountHolder()+"----Account #: "+getAccountNumber()+"-----Balance is: "+getBalance();
    }




}
