/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.daoFactory;

import pl.lodz.uni.math.user.User;
import java.util.ArrayList;
import org.easymock.EasyMock;
import org.easymock.Mock;
import org.junit.Test;
import static org.junit.Assert.*;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;

/**
 *
 * @author micha
 */
public class DaoFactoryTest {

    public DaoFactoryTest() {
    }
    
    
    private final ArrayList<User> userList = new ArrayList<>();
    
    @Mock
    Xml xmlMock = EasyMock.createMock(Xml.class);
    
    @Mock
    DB dbMock = EasyMock.createMock(DB.class);
    
    @Mock
    WebService webServiceMock = EasyMock.createMock(WebService.class);
    
    {
        userList.add(new User(1, "Jan", "Kowalski"));
        userList.add(new User(2, "Piotr", "Nowak"));
        userList.add(new User(3, "Paweł", "Nowy"));
        
        EasyMock.expect(xmlMock.getUsers()).andReturn(userList);
        EasyMock.replay(xmlMock);
        
        EasyMock.expect(dbMock.getUsers()).andReturn(userList);
        EasyMock.replay(dbMock);
        
        EasyMock.expect(webServiceMock.getUsers()).andReturn(userList);
        EasyMock.replay(webServiceMock);
    }
    
    @Test
    public void selectAllUserReturnUserListWithSourceDb(){
        DaoFactory instance=new DaoFactory();
        instance.setSourceForTests(dbMock);
        ArrayList result=null;
        try{
            result=instance.selectAllUsers();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        ArrayList expected=userList;
        assertEquals(expected, result);
    }
    
    @Test
    public void selectAllUserReturnUserListWithSourceXml(){
        DaoFactory instance=new DaoFactory();
        instance.setSourceForTests(xmlMock);
        ArrayList result=null;
        try{
            result=instance.selectAllUsers();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        ArrayList expected=userList;
        assertEquals(expected, result);
    }
    
    @Test
    public void selectAllUserReturnUserListWithSourceWebService(){
        DaoFactory instance=new DaoFactory();
        instance.setSourceForTests(webServiceMock);
        ArrayList result=null;
        try{
            result=instance.selectAllUsers();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        ArrayList expected=userList;
        assertEquals(expected, result);
    }
}
