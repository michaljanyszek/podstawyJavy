/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.bank;

import pl.lodz.uni.math.client.Client;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Stud
 */
public class Bank {
    private final String name;
    private final ArrayList<Client> clients;
    private final static Logger LOGGER = Logger.getLogger(Bank.class.getName());

    public Bank(String name) {
        this.name = name;
        clients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addClient(Client c) {
        clients.add(c);
    }

    public void removeClient(Client c) {
        clients.remove(c);
    }

    public void printClients() {
        LOGGER.info("Clients of bank: " + name);
        clients.stream().forEach(c -> {
            c.print();
        });
    }
}
