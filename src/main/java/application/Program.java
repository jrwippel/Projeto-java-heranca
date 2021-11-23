package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {

    public static void main(String[]args){

        BusinessAccount account = new BusinessAccount(2478, "Jackson Ricardo Wippel", 0.0, 15000.00);

        System.out.println(account.getBalance());

        account.deposit(10000.00);

        System.out.println(account.getBalance());

        account.withdraw(3000.00);


        System.out.println(account.getBalance());

        account.loan(5000.00);


        System.out.println(account.getBalance());
    }
}
