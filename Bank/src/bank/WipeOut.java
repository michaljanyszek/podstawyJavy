/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Date;

/**
 *
 * @author micha
 */
public class WipeOut extends Transaction{
    private String country;
    private String swift;
    private Account toAccount;

    public WipeOut(String country, String swift, Account toAccount,double amount,Date date,String description) {
        this.country = country;
        this.swift = swift;
        this.toAccount = toAccount;
        this.amount=amount;
        this.date=date;
        this.description=description;
    }
    
    
}
