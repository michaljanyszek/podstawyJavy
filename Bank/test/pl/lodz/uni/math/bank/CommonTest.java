/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.bank;

import pl.lodz.uni.math.bank.Common;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class CommonTest {
    
    public CommonTest() {
    }
    
    
    @Test
    public void TestCheckDigit() {
        String number="940629084554789";
        boolean result=Common.CheckDigit(number);
        assertTrue(result);
    }
    
}
