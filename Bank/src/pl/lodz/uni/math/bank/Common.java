/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.bank;

/**
 *
 * @author micha
 */
public class Common {
    public static boolean CheckDigit(String number){
        if(number.length()!=15)
            return false;        
        return true;
    }
}
