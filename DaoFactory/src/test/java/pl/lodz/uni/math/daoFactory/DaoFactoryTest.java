/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.daoFactory;

import java.util.ArrayList;
import org.easymock.EasyMock;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class DaoFactoryTest {

    public DaoFactoryTest() {
    }

    @BeforeClass
    public static void SetupMocks() {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User(1, "Jan", "Kowalski"));
        userList.add(new User(2, "Piotr", "Nowak"));
        userList.add(new User(3, "Paweł", "Nowy"));

        Xml xmlMock = EasyMock.createMock(Xml.class);
        EasyMock.expect(xmlMock.getUsers()).andReturn(userList);
        EasyMock.replay(xmlMock);

        DB dbMock = EasyMock.createMock(DB.class);
        EasyMock.expect(dbMock.getUsers()).andReturn(userList);
        EasyMock.replay(dbMock);

        WebService webServiceMock = EasyMock.createMock(WebService.class);
        EasyMock.expect(webServiceMock.getUsers()).andReturn(userList);
        EasyMock.replay(webServiceMock);
    }

    @Test
    public void GetUserByIdWithSourceXmlSuccess() {
        DaoFactory instance = new DaoFactory();
        instance.setSourceOfData(Source.Xml);
        User expected = new User(1, "Jan", "Kowalski");
        User result = instance.selectUserById(1);
        assertEquals(expected, result);
    }

    @Test
    public void GetUserByIdWithSourceDbSuccess() {
        DaoFactory instance = new DaoFactory();
        instance.setSourceOfData(Source.DB);
        User expected = new User(2, "Piotr", "Nowak");
        User result = instance.selectUserById(2);
        assertEquals(expected, result);
    }

    @Test
    public void GetUserByIdWithSourceWebServiceSuccess() {
        DaoFactory instance = new DaoFactory();
        instance.setSourceOfData(Source.WebService);
        User expected = new User(3, "Paweł", "Nowy");
        User result = instance.selectUserById(3);
        assertEquals(expected, result);
    }
}
