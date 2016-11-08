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
public class Check extends Transaction {
    private Account toAccount;
    
    public Check(Account account,double amount,Date date,String description){
        this.toAccount=account;
        this.amount=amount;
        this.date=date;
        this.description=description;
    }
}
