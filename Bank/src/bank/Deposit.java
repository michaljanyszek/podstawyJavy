/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

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
    
}
