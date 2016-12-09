/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.daoFactory;

/**
 *
 * @author micha
 */
public class DB implements ISource{
    private static DB instance;
    private DB(){}
    
    public DB getInstance(){
        if(instance==null)
            instance=new DB();
        return instance;
    }
    
    @Override
    public User getUsers(){
        return null;
    }
}
