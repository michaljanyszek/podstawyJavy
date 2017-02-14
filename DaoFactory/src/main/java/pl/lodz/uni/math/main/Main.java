/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.main;

import pl.lodz.uni.math.daoFactory.DaoFactory;
import pl.lodz.uni.math.sources.Source;

/**
 *
 * @author micha
 */
public class Main {
    public static void main(String[] args){
        DaoFactory dao = DaoFactory.getInstance();
        
        dao.setSourceOfData(Source.Xml);
        dao.getSource().selectUserById(1);
        
        dao.setSourceOfData(Source.DB);
        dao.getSource().selectUserById(1);
        
        dao.setSourceOfData(Source.WebService);
        dao.getSource().selectUserById(1);
        
        DaoFactory dao2 = DaoFactory.getInstance();
        dao2.setSourceOfData(Source.Xml);
        dao2.getSource().selectUserById(1);
    }
}
