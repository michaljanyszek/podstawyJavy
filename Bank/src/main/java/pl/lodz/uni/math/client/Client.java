/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.client;

import java.util.ArrayList;
import java.util.logging.Logger;
import pl.lodz.uni.math.account.Account;

/**
 *
 * @author micha
 */
public class Client {

    private final static Logger LOGGER = Logger.getLogger(Client.class.getName());
    private String firstName, lastName, address;
    private int wireNumber;
    private ArrayList<Account> accountList;

    public Client(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.wireNumber = 1;
        accountList = new ArrayList<>();
    }

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getWireNumber() {
        return wireNumber;
    }

    public void setWireNumber(int wireNumber) {
        this.wireNumber = wireNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void print() {
        LOGGER.info("\tCustomer: " + firstName + " " + lastName + ", " + address);
        accountList.stream().forEach(a -> {
            a.showBalance();
        });
    }
}
