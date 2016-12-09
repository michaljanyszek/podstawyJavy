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
public class Xml implements ISource{
    private static Xml instance;
    private Xml(){}
    
    public Xml getInstance(){
        if(instance==null)
            instance=new Xml();
        return instance;
    }
    
    
    @Override
    public User getUsers(){
        return null;
    }
}
