/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.daoFactory;

import java.util.ArrayList;

/**
 *
 * @author micha
 */
public class DaoFactory {

    private Enum source;

    public ArrayList<User> selectAllUsers() {
        ArrayList<User> userList = new ArrayList<>();

        try {
            userList = initializeUsersList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return userList;
    }

    public User selectUserById(int userId) {
        ArrayList<User> userList = new ArrayList<>();

        try {
            userList = initializeUsersList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (User user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    public void setSourceOfData(Enum Source) {
        this.source = Source;
    }

    private ArrayList<User> initializeUsersList() throws Exception {
        if (source == null) {
            throw new Exception("First set source.");
        }
        if (source == Source.DB) {
            return DB.getInstance().getUsers();
        } else if (source == Source.WebService) {
            return WebService.getInstance().getUsers();
        } else if (source == Source.Xml) {
            return Xml.getInstance().getUsers();
        }
        return null;
    }
}
