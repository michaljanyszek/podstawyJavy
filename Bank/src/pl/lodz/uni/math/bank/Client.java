/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.bank;

import java.util.ArrayList;

/**
 *
 * @author micha
 */
public class Client {
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts;
    private static int transactionNumber=1;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts=new ArrayList<>();
    }
    public void AddAcount(Account account){
        if(!accounts.contains(account))
            accounts.add(account);
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public ArrayList<Account> GetAccounts(){
        return accounts;
    }
}

