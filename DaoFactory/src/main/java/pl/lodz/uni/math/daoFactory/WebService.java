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
public class WebService implements ISource{
    private static WebService instance;
    private WebService(){}
    
    public static WebService getInstance(){
        if(instance==null)
            instance=new WebService();
        return instance;
    }
    
    @Override
    public ArrayList<User> getUsers(){
        return new ArrayList<>();
    }
}
