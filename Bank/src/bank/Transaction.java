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
public abstract class Transaction {
    protected double amount;
    protected Date date;
    protected String description;
    protected void doTransaction(){}
}
