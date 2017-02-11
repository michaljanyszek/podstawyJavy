/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.main;

/**
 *
 * @author micha
 */
import java.util.Date;
import pl.lodz.uni.math.bank.Account;
import pl.lodz.uni.math.bank.Bank;
import pl.lodz.uni.math.bank.Check;
import pl.lodz.uni.math.bank.Client;


public class Main {
    public static void main(String[] args) {
        
        Bank PKO=new Bank("PKO");
        
        Client c1=new Client("Michal", "Janyszek");
        PKO.AddClient(c1);
        try{
            c1.AddAcount(new Account("oszczednosciowe", "123456789123456"));
        }
        catch(Exception e){
        System.out.println("So close...");
        }
        Account a=c1.GetAccounts().get(0);
        a.IncreaseAmount(1000);
        
        Check check=new Check(a, 150, new Date(), "first");
        a.DoTransation(check);
        a.ViewTransactionsHistory();
        System.out.println(a.GetAmount());
        
    }
}
