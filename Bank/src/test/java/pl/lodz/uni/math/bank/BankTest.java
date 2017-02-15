/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.bank;

import java.util.ArrayList;
import org.easymock.EasyMock;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import pl.lodz.uni.math.client.Client;

/**
 *
 * @author michal
 */
public class BankTest {
    
    public BankTest() {
    }
    
    Client clientMock;
    Bank bank;

    @Before
    public void setUp(){
        bank = new Bank("PKO");
        clientMock = EasyMock.createMock(Client.class);
        EasyMock.expect(clientMock.getFirstName()).andReturn("Jan");
        EasyMock.expect(clientMock.getLastName()).andReturn("Kowalski");
        EasyMock.replay(clientMock);
    }
    
    @Test
    public void testAddClient() {
        bank.addClient(clientMock);
        ArrayList clientList = bank.getClientList();
        assertEquals(clientList.size(), 1);
        Client client = (Client)clientList.get(0);
        assertEquals(client.getFirstName(), "Jan");
        assertEquals(client.getLastName(), "Kowalski");
    }

    @Test
    public void testRemoveClient() {
        bank.removeClient(clientMock);
        assertEquals(bank.getClientList().size(), 0);
    }
}
