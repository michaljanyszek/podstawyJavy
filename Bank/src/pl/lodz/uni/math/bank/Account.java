/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.bank;

import java.util.ArrayList;

/**
 *
 * @author Stud
 */
public class Account {
    private String description;
    private String number;
    private double amount=0;
    private ArrayList<Transaction> transactionsHistory;
    
    public Account(){}
    public Account(String description,String number) throws Exception{
        if(!Common.CheckDigit(number))
            throw new Exception("Incompatible account number");
        this.description=description;
        this.number=number;
        this.transactionsHistory=new ArrayList<>();
    }
    
    public void ViewTransactionsHistory(){
        for(Transaction transaction : transactionsHistory){
            System.out.println(transaction.toString());
        }
    }
    public void AddToHistory(Transaction transaction){
        this.transactionsHistory.add(transaction);
    }
    public void DoTransation(Transaction transaction){
        if(transaction instanceof Check)
            Check.DoTransaction(transaction, this);
        else if(transaction instanceof Deposit)
            Deposit.DoTransaction(transaction, this);
        /*else if(transaction instanceof WipeOut)
        WipeOut.DoTransaction(transaction, this, transactionsHistory);*/
    }
    public void DecreaseAmount(double amount){
        this.amount-=amount;
    }
    public void IncreaseAmount(double amount){
        this.amount+=amount;
    }
    public double GetAmount(){
        return this.amount;
    }

    @Override
    public String toString() {
        return "Account{" + "number=" + number + '}';
    }
}
