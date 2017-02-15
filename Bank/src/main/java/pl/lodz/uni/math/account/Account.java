/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.account;

import pl.lodz.uni.math.transactions.Transaction;
import pl.lodz.uni.math.transactions.Deposit;
import pl.lodz.uni.math.transactions.Check;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import pl.lodz.uni.math.client.Client;
import pl.lodz.uni.math.transactions.WireOut;

/**
 *
 * @author Stud
 */
public class Account {

    private final static Logger LOGGER = Logger.getLogger(Account.class.getName());
    private String number, description;
    private Client client;
    private List transactionHistory;
    private double balance;
    private int depositNumber, checkNumber;

    public Account(String number, String description, Client client, double balance) throws Exception {
        LOGGER.info("Tworzenie konta o numerze " + number);
        try {
            Long.valueOf(number);
            if (number.length() != 15) {
                throw new AccountNumberException("Numer konta powinien miec 15 znakow");
            }
        } catch (AccountNumberException ex) {
            throw new AccountNumberException("Numer konta powinien zawierac same cyfry");
        }
        this.number = number;
        this.description = description;
        this.client = client;
        this.transactionHistory = new ArrayList<Transaction>();
        this.balance = balance;
        this.depositNumber = 1;
        this.checkNumber = 1;
        client.getAccountList().add(this);
        LOGGER.info("Konto utworzone");

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void doDeposit(Account toAccount, double amount, Date date, String description) {
        LOGGER.info("Rejestracja depozytu z konta " + this.getNumber() + " do konta: " + toAccount.getNumber());
        Deposit deposit = new Deposit(toAccount, amount, date, description, depositNumber++);
        this.balance -= amount;
        toAccount.setBalance(toAccount.getBalance() + amount);
        transactionHistory.add(deposit);
        LOGGER.info("Rejestracja depozytu zakonczona pozytywnie");
    }

    public void doCheck(Account fromAccount, double amount, Date date, String description) {
        LOGGER.info("Rejestracja czeku z konta " + fromAccount.getNumber() + " do konta: " + this.getNumber());
        Check check = new Check(fromAccount, amount, date, description, checkNumber++);
        transactionHistory.add(check);
        this.balance += amount;
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        LOGGER.info("Rejestracja czeku zakonczona pozytywnie");
    }

    public void doWireOut(Account toAccount, String country, String swift, double amount, Date date, String description) {
        LOGGER.info("Rejestracja wire-out z konta " + this.getNumber() + " do konta: " + toAccount.getNumber());
        WireOut wireOut = new WireOut(toAccount, country, swift, amount, date, description, client.getWireNumber());
        transactionHistory.add(wireOut);
        this.balance -= amount;
        toAccount.setBalance(toAccount.getBalance() + amount);
        LOGGER.info("Rejestracja wire-out zakonczona pozytywnie");
    }

    public List getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(List transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public void showBalance() {
        LOGGER.info("\t\t" + number + " balance: " + balance);
    }
}
