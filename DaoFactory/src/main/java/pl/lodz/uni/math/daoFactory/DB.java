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
public class DB implements ISource{
    private static DB instance;
    private DB(){}
    
    public static DB getInstance(){
        if(instance==null)
            instance=new DB();
        return instance;
    }
    
    @Override
    public ArrayList<User> getUsers(){
        return new ArrayList<>();
    }
}
