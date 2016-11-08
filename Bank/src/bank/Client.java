/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

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
    }
    public void addAcount(Account account){
        this.accounts.add(account);
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    
}

