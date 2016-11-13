/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.bank;

import java.util.Date;

/**
 *
 * @author Stud
 */
public class Deposit extends Transaction {
    private Account fromAccount;
    
    public Deposit(Account account,double amount,Date date,String description){
        this.fromAccount=account;
        this.amount=amount;
        this.date=date;
        this.description=description;
    }
    
    public static void DoTransaction(Transaction deposit,Account toAccount){
        toAccount.IncreaseAmount(deposit.amount);
        toAccount.AddToHistory(deposit);
    }

    @Override
    public String toString() {
        return "Deposit{" + "fromAccount=" + fromAccount +" Amount:"+amount+" Date:"+date+" Description:"+description+ '}';
    }
    
}
