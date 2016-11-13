/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.bank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stud
 */
public class Bank {
    private String bankName;
    private List<Client> clientList;
    

    public Bank(String bankName) {
        this.bankName = bankName;
        this.clientList=new ArrayList();
    }
    public String getName() {
        return bankName;
    }
    public void AddClient(Client client){
        if(!clientList.contains(client))
            clientList.add(client);
    }
}
