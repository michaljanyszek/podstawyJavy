/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.exampletests;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Stud
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    
    @Test
    public void testAdd() {
        int a = 5;
        int b = 4;
        Calculator instance = new Calculator();
        int expResult = 9;
        int result = instance.Add(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinus() {
        int a = 9;
        int b = 3;
        Calculator instance = new Calculator();
        int expResult = 6;
        int result = instance.Minus(a, b);
        assertEquals(expResult, result);
    }
    
}
