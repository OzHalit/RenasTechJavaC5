package day28_OOP_Encapsulation;

public class c4_CapitalOneObject {
    public static void main(String[] args) {
        c3_bankAccountCapitalOne account1=new c3_bankAccountCapitalOne("L","A");

        System.out.println("Account Holder: "+account1.getAccountHolder());
        account1.setBalance(112.20);
        account1.deposit(10);
        System.out.println("Balance: "+account1.getBalance());
        System.out.println("Libby witdraws $50");
        account1.withdraw(50);
        System.out.println("Libby now has: $"+account1.getBalance());
        System.out.println("********************************");
        account1.setAccountNumber(123654987);
        System.out.println(account1);

        System.out.println("***New account info for Gulsum");
        c3_bankAccountCapitalOne account2=new c3_bankAccountCapitalOne("G" , "B");

        System.out.println(account2);
        account2.deposit(50);
        System.out.println(account2.getBalance());


    }




}
