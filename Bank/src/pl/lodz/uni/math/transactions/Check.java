/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.transactions;

import java.util.Date;
import pl.lodz.uni.math.account.Account;

/**
 *
 * @author Stud
 */
public class Check extends Transaction {

    private Account toAccount;

    public Check(Account toAccount, double amount, Date date, String description, int number) {
        super(amount, date, description, number);
        this.toAccount = toAccount;
    }

    @Override
    public String toString() {
        return "Check number: " + this.number + " toAccount " + toAccount.getNumber() + " with amount " + super.amount + " date " + super.date + " description: " + description;
    }

}
