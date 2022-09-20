package com.inter.fAbstractExamples.application;

import com.inter.fAbstractExamples.entities.Account;
import com.inter.fAbstractExamples.entities.BusinessAccount;
import com.inter.fAbstractExamples.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //Account acc1 = new Account(1001, "Caique", 1000.0); Can't instance abstract classes
        Account acc2 = new SavingsAccount(1001, "Suxu", 456.98, 0.01);
        Account acc3 = new BusinessAccount(1002, "Maria", 1823.56, 500.0);
        Account acc4 = new BusinessAccount(1003, "Bob", 324.26, 50.0);
        Account acc5 = new SavingsAccount(1004, "Caique", 4567.78, 0.02);

        List<Account> list = new ArrayList<>();

        list.add(acc2);
        list.add(acc3);
        list.add(acc4);
        list.add(acc5);

        double sum = 0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10);
            System.out.println("New balance, " + acc.getBalance());
        }
    }
}
