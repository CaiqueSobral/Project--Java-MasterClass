package com.inter.eInheritance.bankExample.application;

import com.inter.eInheritance.bankExample.entities.Account;
import com.inter.eInheritance.bankExample.entities.BusinessAccount;
import com.inter.eInheritance.bankExample.entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {
        Account acc = new Account(1001, "Caique", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Suxu", 0.0, 500.00);

        // Upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DownCasting
        //BusinessAccount acc4 = acc2; // Error - Cant cast Account to Business account

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);

        //BusinessAccount acc5 = (BusinessAccount) acc3; // Error - ClassCastException can't cast Saving account to Business Account
        // How to avoid:

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
