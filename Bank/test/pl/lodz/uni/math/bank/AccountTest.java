/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.bank;

import pl.lodz.uni.math.bank.Account;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @Test
    public void testDecreaseAmount() {
        Account instance = new Account();
        double amount = 10;        
        instance.DecreaseAmount(amount);
        double expected=-10;
        boolean result=false;
        if(expected==instance.GetAmount())
            result=true;
        assertTrue(result);
    }

    @Test
    public void testIncreaseAmount() {
        Account instance = new Account();
        double amount = 10;        
        instance.IncreaseAmount(amount);
        double expected=10;
        boolean result=false;
        if(expected==instance.GetAmount())
            result=true;
        assertTrue(result);
    }
    
}
