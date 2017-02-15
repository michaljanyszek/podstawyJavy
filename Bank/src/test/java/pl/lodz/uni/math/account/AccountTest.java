/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.account;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;
import org.easymock.EasyMock;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import pl.lodz.uni.math.client.Client;

/**
 *
 * @author michal
 */
public class AccountTest {

    public AccountTest() {
    }

    public static final Logger LOGGER = Logger.getLogger(AccountTest.class.getName());
    Account firstAccount, secondAccount;
    Client firstClient, secondClient;

    @Before
    public void setUp() {
        ArrayList firstAccountList;
        firstAccountList = new ArrayList<Account>();
        ArrayList secondAccountList;
        secondAccountList = new ArrayList<Account>();
        firstAccountList.add(firstAccount);
        secondAccountList.add(secondAccount);

        firstClient = EasyMock.createMock(Client.class);
        EasyMock.expect(firstClient.getFirstName()).andReturn("Jan");
        EasyMock.expect(firstClient.getLastName()).andReturn("Kowalski");
        EasyMock.expect(firstClient.getAccountList()).andReturn(firstAccountList);
        EasyMock.expect(firstClient.getWireNumber()).andReturn(1);
        EasyMock.replay(firstClient);

        secondClient = EasyMock.createMock(Client.class);
        EasyMock.expect(secondClient.getFirstName()).andReturn("Jan");
        EasyMock.expect(secondClient.getLastName()).andReturn("Kowalski");
        EasyMock.expect(secondClient.getAccountList()).andReturn(secondAccountList);
        EasyMock.expect(secondClient.getWireNumber()).andReturn(1);
        EasyMock.replay(secondClient);

        try {
            firstAccount = new Account("890243546372897", "Osobiste", firstClient, 2500.0);
            secondAccount = new Account("986421637905748", "Oszczednosciowe", secondClient, 3000.0);
        } catch (Exception ex) {
            LOGGER.info(ex.getMessage());
        }
    }

    @Test
    public void testDoDepositSuccess() {
        firstAccount.doDeposit(secondAccount, 150, new Date(), "depozyt");
        assertEquals(2350.0, firstAccount.getBalance(), 0);
        assertEquals(3150.0, secondAccount.getBalance(), 0);
        assertEquals(1, firstAccount.getTransactionHistory().size());
    }

    @Test
    public void testDoCheckSuccess() {
        firstAccount.doCheck(secondAccount, 125, new Date(), "czek");
        assertEquals(2625.0, firstAccount.getBalance(), 0);
        assertEquals(2875.0, secondAccount.getBalance(), 0);
        assertEquals(1, firstAccount.getTransactionHistory().size());
    }

    @Test
    public void testDoWireOutSuccess() {
        firstAccount.doWireOut(secondAccount, "PL", "616", 17.5, new Date(), "wireOut");
        assertEquals(2482.5, firstAccount.getBalance(), 0);
        assertEquals(3017.5, secondAccount.getBalance(), 0);
        assertEquals(1, firstAccount.getTransactionHistory().size());
    }
}
