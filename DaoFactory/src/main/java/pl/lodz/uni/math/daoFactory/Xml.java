/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.daoFactory;

import pl.lodz.uni.math.user.User;
import java.util.ArrayList;

/**
 *
 * @author micha
 */
public class Xml implements ISource{
    private static Xml instance;
    private Xml(){}
    
    public static Xml getInstance(){
        if(instance==null)
            instance=new Xml();
        return instance;
    }
    
    
    @Override
    public ArrayList<User> getUsers(){
        return new ArrayList<>();
    }
}
