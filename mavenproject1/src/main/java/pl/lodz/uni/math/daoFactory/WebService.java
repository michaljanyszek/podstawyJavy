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
public class WebService implements ISource{
    private static WebService instance;
    private WebService(){}
    
    public WebService getInstance(){
        if(instance==null)
            instance=new WebService();
        return instance;
    }
    
    @Override
    public User getUsers(){
        return null;
    }
}
