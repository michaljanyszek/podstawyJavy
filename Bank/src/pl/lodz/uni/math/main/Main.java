/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.main;

/**
 *
 * @author micha
 */
import java.util.Date;
import java.util.logging.Logger;
import pl.lodz.uni.math.account.Account;
import pl.lodz.uni.math.bank.Bank;
import pl.lodz.uni.math.client.Client;


public class Main {
    public static final Logger LOGGER = Logger.getLogger("Main");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("BANK");
        logger.info("Program Bank");
        
        Bank bank = new Bank("Nowy");

        Client clientAdam = new Client("Adam", "Nowak", "Lodz");
        Client clientJan = new Client("Jan", "Kowalski", "Poznan");

        
        Account accountAdam = new Account("987654321098765", "Prywatne", clientAdam, 1000);
        Account accountJan = new Account("123456789111101", "Firmowe", clientJan, 2000);

        bank.addClient(clientJan);
        bank.addClient(clientAdam);
        
        accountAdam.doCheck(accountJan, 200, new Date(), "Opis");
        accountAdam.doDeposit(accountJan, 321, new Date(), "Opis 2");
        accountAdam.doWireOut(accountJan, "Kraj", "Swift", 1200., new Date(), "Opis 3");
        logger.info("Historia transakcji Adama");
        accountAdam.getTransactionHistory().stream().forEach(x -> logger.info(x.toString()));
        
        logger.info("Historia transakcji Jana");
        accountJan.getTransactionHistory().stream().forEach(x -> logger.info(x.toString()));

        accountJan.doCheck(accountAdam, 200, new Date(), "Przelew");
        accountJan.doDeposit(accountAdam, 200, new Date(), "Depozyt");
        accountJan.doWireOut(accountAdam, "Kraj 2", "Swift 2", 1240., new Date(), "WireOut");
        accountJan.doCheck(accountAdam, 230, new Date(), "Czek");
        logger.info("Historia transakcji Jana");
        accountJan.getTransactionHistory().stream().forEach(x -> logger.info(x.toString()));
        
        
        bank.printClients();
    }
}
