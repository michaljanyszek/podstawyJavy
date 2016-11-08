/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.ArrayList;

/**
 *
 * @author Stud
 */
public class Account {
    private String description;
    private String number;
    private ArrayList<Transaction> transactionsHistory;
    
    public Account(String description,String number){
        this.description=description;
        this.number=number;
        this.transactionsHistory=new ArrayList<>();
    }
    
    public void ViewTransactionsHistory(){
        for(Transaction transaction : transactionsHistory){
            //TODO: how we should show history?
        }
    }
}
